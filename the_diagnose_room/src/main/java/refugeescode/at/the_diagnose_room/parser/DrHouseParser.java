package refugeescode.at.the_diagnose_room.parser;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DrHouseParser {
    //private ResourceLoader resourceLoader;

//    //public DrHouseParser(DefaultResourceLoader resourceLoader) {
//        this.resourceLoader = resourceLoader;
//    }

    private ResourceLoader resourceLoader;
    private Map<String, List<String>> map = new HashMap<>();

    public DrHouseParser(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public Map<String, List<String>> getDiagnoses() {

        Resource resource = resourceLoader.getResource("classpath:file.csv");
        try {
            Files.lines(resource.getFile().toPath())
                    .skip(1)
                    .map(line -> line.split(";"))
                    .filter(line -> line != null && line.length == 2)
                    .peek(e -> System.out.println(e[0] + "  ===  " + e[1]))
                    .forEach(e -> map.put(e[0], tolist(e[1])));


        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    private List<String> tolist(String s) {
        return Arrays.asList(s.split(","));
    }
}

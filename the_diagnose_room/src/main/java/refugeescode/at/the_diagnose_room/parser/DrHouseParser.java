package refugeescode.at.the_diagnose_room.parser;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

import java.util.stream.Stream;

import static java.nio.file.Files.lines;

@Service
public class DrHouseParser {
    //private ResourceLoader resourceLoader;

//    //public DrHouseParser(DefaultResourceLoader resourceLoader) {
//        this.resourceLoader = resourceLoader;
//    }

    private  ResourceLoader resourceLoader;

    public DrHouseParser(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public Map<String, List<String>> getDiagnoses() {
        Map<String, List<String>> map = new HashMap<>();
        Resource resource = resourceLoader.getResource("classpath:file.csv");
        try {
            Files.lines(resource.getFile().toPath())
                    .skip(1)
                    .map(line -> line.split(";"))
                    .peek(e-> System.out.println(e[0]))
                    .forEach(e -> map.put(e[0], tolist(e[1])));


        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    private List<String> tolist(String s) {
        return Collections.singletonList(s.split(",").toString());
    }
}

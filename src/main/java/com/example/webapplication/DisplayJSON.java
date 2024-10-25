package com.example.webapplication;

import LocalDevelopment.Container;
import LocalDevelopment.DataGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayJSON {
    @GetMapping("/generate")
    public String generateContainer() throws IOException {
        // Generate a new container instance
        Container container = DataGenerator.generateContainer();

        // Convert the container to JSON format
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(container);
    }
}

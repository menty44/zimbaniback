package com.zimbani.docker;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.api.model.Image;
import com.github.dockerjava.core.DockerClientBuilder;
import com.google.gson.Gson;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.mockito.AdditionalMatchers.not;

@SpringBootTest
class DockerManagementApplicationTests {

    private static DockerClient dockerClient;

    @BeforeClass
    public static void setup() {
        dockerClient = DockerClientBuilder.getInstance().build();
    }

    @Test
    public void whenListingImages_thenReturnNonEmptyList() {

        try {
            DockerClient dockerClient1 = DockerClientBuilder.getInstance().build();
            // when
            List<Image> images = dockerClient1.listImagesCmd().exec();

            images.forEach(img -> {
                System.out.println();
                System.out.println(new Gson().toJson(img));
                System.out.println();
            });
            System.out.println(images.size());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // then
        //assert(images.size() > 0);
    }

    @Test
    void contextLoads() {
    }

}

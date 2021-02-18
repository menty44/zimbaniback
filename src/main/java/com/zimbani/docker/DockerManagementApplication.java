package com.zimbani.docker;

import com.github.dockerjava.api.DockerClient;
import com.github.dockerjava.core.DockerClientBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.dockerjava.api.command.InspectImageResponse;
import com.github.dockerjava.api.model.Image;
import com.github.dockerjava.api.model.SearchItem;

import java.util.List;

@SpringBootApplication
public class DockerManagementApplication {

    //private static DockerClient dockerClient;

    public static void main(String[] args) {
        SpringApplication.run(DockerManagementApplication.class, args);
//        dockerClient = DockerClientBuilder.getInstance().build();
//        DockerClient dockerClient
//                = DockerClientBuilder.getInstance("unix:///var/run/docker.sock").build();
//
//        List<Image> images = dockerClient.listImagesCmd().exec();
//
//        System.out.println();
//        System.out.println();
//        System.out.println();
//        System.out.println(images);

    }

}

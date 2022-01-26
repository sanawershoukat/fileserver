package com.core.fileserver.service.impl;

import com.core.fileserver.dto.FileDTO;
import com.core.fileserver.dto.RevokeDTO;
import com.core.fileserver.dto.ShareDTO;
import com.core.fileserver.property.FileStorageProperties;
import com.core.fileserver.service.FabricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FabricServiceImpl implements FabricService {

    RestTemplate restTemplate;

    @Value("${fabric.createFile}")
    String fabricCreateFileUrl;

    @Value("${fabric.shareFile}")
    String fabricShareFileUrl;

    @Value("${fabric.revokeFileAccess}")
    String fabricRevokeFileAccessUrl;

    @Autowired
    FileStorageProperties fileStorageProperties;

    @Override
    public String createFile(FileDTO fileDTO) {

        restTemplate = new RestTemplate();
        String response = restTemplate.postForObject(fabricCreateFileUrl, fileDTO, String.class);
        System.out.println(response);
        return response;
    }

    @Override
    public String shareFile(ShareDTO shareDTO) {

        restTemplate = new RestTemplate();
        String response = restTemplate.postForObject(fabricShareFileUrl, shareDTO, String.class);
        System.out.println(response);
        return response;
    }

    @Override
    public String revokeFileAccess(RevokeDTO revokeDTO) {

        restTemplate = new RestTemplate();
        String response = restTemplate.postForObject(fabricRevokeFileAccessUrl, revokeDTO, String.class);
        System.out.println(response);
        return response;
    }
}

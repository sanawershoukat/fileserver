package com.core.fileserver.service;

import com.core.fileserver.dto.FileDTO;
import com.core.fileserver.dto.RevokeDTO;
import com.core.fileserver.dto.ShareDTO;
import org.springframework.stereotype.Service;

@Service
public interface FabricService {

    String createFile(FileDTO fileDTO);
    String shareFile(ShareDTO shareDTO);
    String revokeFileAccess(RevokeDTO revokeDTO);

}

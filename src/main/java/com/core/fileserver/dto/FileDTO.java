package com.core.fileserver.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FileDTO {

    private String fileId;
    private String fileName;
    private String fileSize;
    private String owner;
    private String companyId;
    private String fileHash;
}

package com.file.FileUpload.model;

import org.springframework.web.multipart.MultipartFile;

public class AddDriverRequest {
    private String email;
    private MultipartFile file;

    public AddDriverRequest() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}


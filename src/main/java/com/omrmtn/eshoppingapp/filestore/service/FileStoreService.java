package com.omrmtn.eshoppingapp.filestore.service;

import com.omrmtn.eshoppingapp.filestore.service.s3.FileService;
import java.io.InputStream;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Slf4j
@Service
@RequiredArgsConstructor
public class FileStoreService {

    private final FileService fileService;

    public Mono<byte[]> getImage(String id) {
        return Mono.just(fileService.get(id));
    }

    public void saveImage(String id, InputStream isFile) {
        fileService.save(id, MediaType.IMAGE_JPEG_VALUE, isFile);
    }

    public void delete(String id) {
        fileService.delete(id);
    }
}

package com.note_book.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import static com.note_book.common.Constance.*;

public class FileUtil {
    public static boolean saveFile(String content, String fileNameWithSuffix) throws IOException {
        File file = new File(NOVEL_SAVE_PATH + fileNameWithSuffix);
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(content.getBytes());
        return true;
    }
}

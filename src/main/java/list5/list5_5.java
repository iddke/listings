package list5;

import java.io.File;

class listing5_5{
    public static void sameDateToDirFiles(String dir) {

        long modifiled = System.currentTimeMillis(); // текущее время (миллисекунды)
        File walkDir = new File(dir); // просматриваемая папка
        String[] dirList = walkDir.list(); // список элементов в папе
        //последовательный просмотр папки
        for (int i = 0; i < dirList.length; i++) {

            File f = new File(dirList[i]);
            if (f.isDirectory()) {
                // элемент является также каталогом , осуществляется рекурсивный вызов метода
                sameDateToDirFiles(f.getPath());
                continue;
            }
            // для файлов устанавливаем дату последнего изменения
            f.setLastModified(modifiled);
        } // for
    } // sameDateToDirFiles
} // listing5_5

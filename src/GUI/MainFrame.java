package GUI;

import javax.swing.*;
import java.awt.*;

public class MainFrame {

    private JFrame jFrame;
    private JMenuBar jMenuBar;
    private JMenu fileMenu;
    private JMenu folderMenu;
    private JMenuItem createFileItem;
    private JMenuItem deleteFileItem;
    private JMenuItem renameFileItem;
    private JMenuItem copyFileItem;
    private JMenuItem zipFileItem;
    private JMenuItem unzipFileItem;
    private JMenuItem viewFileContentItem;
    private JMenuItem createFolderItem;
    private JMenuItem deleteFolderItem;
    private JMenuItem renameFolderItem;


    public MainFrame() {
        InitComponent();
    }

    public void InitComponent() {
        jFrame = new JFrame("File Management System");
        jFrame.setBounds(100, 100, 600, 400);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jMenuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        folderMenu = new JMenu("Folder");

        // File
        createFileItem = new JMenuItem("Create File");
        createFileItem.setPreferredSize(new Dimension(125,20));
        createFileItem.setIcon(new ImageIcon(getClass().getResource("/Images/add.png")));

        deleteFileItem = new JMenuItem("Delete File");
        deleteFileItem.setPreferredSize(new Dimension(125,20));
        deleteFileItem.setIcon(new ImageIcon(getClass().getResource("/Images/delete.png")));

        renameFileItem = new JMenuItem("Rename File");
        renameFileItem.setPreferredSize(new Dimension(125,20));
        renameFileItem.setIcon(new ImageIcon(getClass().getResource("/Images/document.png")));

        copyFileItem = new JMenuItem("Copy Files");
        copyFileItem.setPreferredSize(new Dimension(125,20));
        copyFileItem.setIcon(new ImageIcon(getClass().getResource("/Images/archives.png")));

        zipFileItem = new JMenuItem("Zip Files");
        zipFileItem.setPreferredSize(new Dimension(125,20));
        zipFileItem.setIcon(new ImageIcon(getClass().getResource("/Images/zip.png")));

        unzipFileItem = new JMenuItem("Unzip Files");
        unzipFileItem.setPreferredSize(new Dimension(125,20));
        unzipFileItem.setIcon(new ImageIcon(getClass().getResource("/Images/unzip.png")));

        viewFileContentItem = new JMenuItem("View File Content");
        viewFileContentItem.setPreferredSize(new Dimension(125,20));
        viewFileContentItem.setIcon(new ImageIcon(getClass().getResource("/Images/view.png")));

        //Folder
        createFolderItem = new JMenuItem("Create Folder");
        createFolderItem.setPreferredSize(new Dimension(125,20));
        createFolderItem.setIcon(new ImageIcon(getClass().getResource("/Images/add.png")));

        deleteFolderItem = new JMenuItem("Delete Folder");
        deleteFolderItem.setPreferredSize(new Dimension(125,20));
        deleteFolderItem.setIcon(new ImageIcon(getClass().getResource("/Images/delete.png")));

        renameFolderItem = new JMenuItem("Rename Folder");
        renameFolderItem.setPreferredSize(new Dimension(125,20));
        renameFolderItem.setIcon(new ImageIcon(getClass().getResource("/Images/document.png")));

        fileMenu.add(createFileItem);
        fileMenu.add(deleteFileItem);
        fileMenu.add(renameFileItem);
        fileMenu.add(copyFileItem);
        fileMenu.add(zipFileItem);
        fileMenu.add(unzipFileItem);
        fileMenu.add(viewFileContentItem);

        folderMenu.add(createFolderItem);
        folderMenu.add(deleteFolderItem);
        folderMenu.add(renameFolderItem);

        jMenuBar.add(fileMenu);
        jMenuBar.add(folderMenu);

        jFrame.setJMenuBar(jMenuBar);
    }

    public static void main(String[] args) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame window = new MainFrame();
                window.jFrame.setVisible(true);
            }
        });
    }
}

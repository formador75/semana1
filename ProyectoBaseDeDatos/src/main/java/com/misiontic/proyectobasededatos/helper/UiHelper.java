package com.misiontic.proyectobasededatos.helper;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

import static com.rola.Constants.COMPONENT_PADDING;
import static com.rola.Constants.GRIDLAYOUT_HORIZONTAL_GAP;
import static com.rola.Constants.GRIDLAYOUT_VERTICAL_GAP;

// TODO(nilsheumer): Add proper JavaDoc, here an for all classes and public functions (except of @Overrides) and where
// ever explanation is necessary.
// TODO(nilsheumer): Use a proper file/console logger framework to log the exceptions.
public final class UiHelper {

    private UiHelper() {
    }

    public static void setAppIcon(JFrame frame, String iconResourceName) {
        try {
           frame.setIconImage(ImageIO.read(ClassLoader.getSystemResource(iconResourceName)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static GridLayout createGridLayout(int rows, int columns) {
        GridLayout gridLayout = new GridLayout(rows, columns);
        gridLayout.setVgap(GRIDLAYOUT_VERTICAL_GAP);
        gridLayout.setHgap(GRIDLAYOUT_HORIZONTAL_GAP);
        return gridLayout;
    }

    public static JPanel createPanel(LayoutManager layout) {
        JPanel panel = new JPanel(layout);
        panel.setBorder(new EmptyBorder(COMPONENT_PADDING, COMPONENT_PADDING, COMPONENT_PADDING, COMPONENT_PADDING));
        return panel;
    }

    public static JPanel createPanel(LayoutManager layout,
            int topPadding, int leftPadding, int bottomPadding, int rightPadding) {
        JPanel panel = new JPanel(layout);
        panel.setBorder(new EmptyBorder(topPadding, leftPadding, bottomPadding, rightPadding));
        return panel;
    }

    public static JButton createButton(String title, ActionListener listener) {
        JButton button = new JButton(title);
        button.addActionListener(listener);
        return button;
    }
}

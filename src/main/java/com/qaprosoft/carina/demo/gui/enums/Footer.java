package com.qaprosoft.carina.demo.gui.enums;

public enum Footer {
    HOME(0), NEWS(1), REVIEWS(2);

    Footer(int footerElement) {
        this.footerElement = footerElement;
    }

    private final int footerElement;

    public int getFooterElement() {
        return footerElement;
    }
}

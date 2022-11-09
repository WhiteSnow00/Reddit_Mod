// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Screen
{
    public static final a<Screen, Screen.Screen$Builder> ADAPTER;
    public final Double android_font_size;
    public final Integer app_font_size_delta;
    public final String auto_dark_mode;
    public final String browser_tab_id;
    public final String density;
    public final Integer height;
    public final Boolean in_focus;
    public final String ios_font_size;
    public final Integer scroll_position;
    public final String theme;
    public final String view_type;
    public final Integer viewport_height;
    public final Integer viewport_width;
    public final Integer width;
    
    static {
        ADAPTER = (a)new Screen.Screen$ScreenAdapter((Screen$1)null);
    }
    
    private Screen(final Screen.Screen$Builder screen$Builder) {
        this.width = Screen.Screen$Builder.access$100(screen$Builder);
        this.height = Screen.Screen$Builder.access$200(screen$Builder);
        this.viewport_width = Screen.Screen$Builder.access$300(screen$Builder);
        this.viewport_height = Screen.Screen$Builder.access$400(screen$Builder);
        this.view_type = Screen.Screen$Builder.access$500(screen$Builder);
        this.theme = Screen.Screen$Builder.access$600(screen$Builder);
        this.in_focus = Screen.Screen$Builder.access$700(screen$Builder);
        this.browser_tab_id = Screen.Screen$Builder.access$800(screen$Builder);
        this.scroll_position = Screen.Screen$Builder.access$900(screen$Builder);
        this.app_font_size_delta = Screen.Screen$Builder.access$1000(screen$Builder);
        this.ios_font_size = Screen.Screen$Builder.access$1100(screen$Builder);
        this.android_font_size = Screen.Screen$Builder.access$1200(screen$Builder);
        this.auto_dark_mode = Screen.Screen$Builder.access$1300(screen$Builder);
        this.density = Screen.Screen$Builder.access$1400(screen$Builder);
    }
    
    @Override
    public boolean equals(final Object o) {
        final boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (!(o instanceof Screen)) {
            return false;
        }
        final Screen screen = (Screen)o;
        final Integer width = this.width;
        final Integer width2 = screen.width;
        if (width == width2 || (width != null && width.equals(width2))) {
            final Integer height = this.height;
            final Integer height2 = screen.height;
            if (height == height2 || (height != null && height.equals(height2))) {
                final Integer viewport_width = this.viewport_width;
                final Integer viewport_width2 = screen.viewport_width;
                if (viewport_width == viewport_width2 || (viewport_width != null && viewport_width.equals(viewport_width2))) {
                    final Integer viewport_height = this.viewport_height;
                    final Integer viewport_height2 = screen.viewport_height;
                    if (viewport_height == viewport_height2 || (viewport_height != null && viewport_height.equals(viewport_height2))) {
                        final String view_type = this.view_type;
                        final String view_type2 = screen.view_type;
                        if (view_type == view_type2 || (view_type != null && view_type.equals(view_type2))) {
                            final String theme = this.theme;
                            final String theme2 = screen.theme;
                            if (theme == theme2 || (theme != null && theme.equals(theme2))) {
                                final Boolean in_focus = this.in_focus;
                                final Boolean in_focus2 = screen.in_focus;
                                if (in_focus == in_focus2 || (in_focus != null && in_focus.equals(in_focus2))) {
                                    final String browser_tab_id = this.browser_tab_id;
                                    final String browser_tab_id2 = screen.browser_tab_id;
                                    if (browser_tab_id == browser_tab_id2 || (browser_tab_id != null && browser_tab_id.equals(browser_tab_id2))) {
                                        final Integer scroll_position = this.scroll_position;
                                        final Integer scroll_position2 = screen.scroll_position;
                                        if (scroll_position == scroll_position2 || (scroll_position != null && scroll_position.equals(scroll_position2))) {
                                            final Integer app_font_size_delta = this.app_font_size_delta;
                                            final Integer app_font_size_delta2 = screen.app_font_size_delta;
                                            if (app_font_size_delta == app_font_size_delta2 || (app_font_size_delta != null && app_font_size_delta.equals(app_font_size_delta2))) {
                                                final String ios_font_size = this.ios_font_size;
                                                final String ios_font_size2 = screen.ios_font_size;
                                                if (ios_font_size == ios_font_size2 || (ios_font_size != null && ios_font_size.equals(ios_font_size2))) {
                                                    final Double android_font_size = this.android_font_size;
                                                    final Double android_font_size2 = screen.android_font_size;
                                                    if (android_font_size == android_font_size2 || (android_font_size != null && android_font_size.equals(android_font_size2))) {
                                                        final String auto_dark_mode = this.auto_dark_mode;
                                                        final String auto_dark_mode2 = screen.auto_dark_mode;
                                                        if (auto_dark_mode == auto_dark_mode2 || (auto_dark_mode != null && auto_dark_mode.equals(auto_dark_mode2))) {
                                                            final String density = this.density;
                                                            final String density2 = screen.density;
                                                            boolean b2 = b;
                                                            if (density == density2) {
                                                                return b2;
                                                            }
                                                            if (density != null && density.equals(density2)) {
                                                                b2 = b;
                                                                return b2;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Integer width = this.width;
        int hashCode = 0;
        int hashCode2;
        if (width == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = width.hashCode();
        }
        final Integer height = this.height;
        int hashCode3;
        if (height == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = height.hashCode();
        }
        final Integer viewport_width = this.viewport_width;
        int hashCode4;
        if (viewport_width == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = viewport_width.hashCode();
        }
        final Integer viewport_height = this.viewport_height;
        int hashCode5;
        if (viewport_height == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = viewport_height.hashCode();
        }
        final String view_type = this.view_type;
        int hashCode6;
        if (view_type == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = view_type.hashCode();
        }
        final String theme = this.theme;
        int hashCode7;
        if (theme == null) {
            hashCode7 = 0;
        }
        else {
            hashCode7 = theme.hashCode();
        }
        final Boolean in_focus = this.in_focus;
        int hashCode8;
        if (in_focus == null) {
            hashCode8 = 0;
        }
        else {
            hashCode8 = in_focus.hashCode();
        }
        final String browser_tab_id = this.browser_tab_id;
        int hashCode9;
        if (browser_tab_id == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = browser_tab_id.hashCode();
        }
        final Integer scroll_position = this.scroll_position;
        int hashCode10;
        if (scroll_position == null) {
            hashCode10 = 0;
        }
        else {
            hashCode10 = scroll_position.hashCode();
        }
        final Integer app_font_size_delta = this.app_font_size_delta;
        int hashCode11;
        if (app_font_size_delta == null) {
            hashCode11 = 0;
        }
        else {
            hashCode11 = app_font_size_delta.hashCode();
        }
        final String ios_font_size = this.ios_font_size;
        int hashCode12;
        if (ios_font_size == null) {
            hashCode12 = 0;
        }
        else {
            hashCode12 = ios_font_size.hashCode();
        }
        final Double android_font_size = this.android_font_size;
        int hashCode13;
        if (android_font_size == null) {
            hashCode13 = 0;
        }
        else {
            hashCode13 = android_font_size.hashCode();
        }
        final String auto_dark_mode = this.auto_dark_mode;
        int hashCode14;
        if (auto_dark_mode == null) {
            hashCode14 = 0;
        }
        else {
            hashCode14 = auto_dark_mode.hashCode();
        }
        final String density = this.density;
        if (density != null) {
            hashCode = density.hashCode();
        }
        return ((((((((((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode7) * -2128831035 ^ hashCode8) * -2128831035 ^ hashCode9) * -2128831035 ^ hashCode10) * -2128831035 ^ hashCode11) * -2128831035 ^ hashCode12) * -2128831035 ^ hashCode13) * -2128831035 ^ hashCode14) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("Screen{width=");
        k.append(this.width);
        k.append(", height=");
        k.append(this.height);
        k.append(", viewport_width=");
        k.append(this.viewport_width);
        k.append(", viewport_height=");
        k.append(this.viewport_height);
        k.append(", view_type=");
        k.append(this.view_type);
        k.append(", theme=");
        k.append(this.theme);
        k.append(", in_focus=");
        k.append(this.in_focus);
        k.append(", browser_tab_id=");
        k.append(this.browser_tab_id);
        k.append(", scroll_position=");
        k.append(this.scroll_position);
        k.append(", app_font_size_delta=");
        k.append(this.app_font_size_delta);
        k.append(", ios_font_size=");
        k.append(this.ios_font_size);
        k.append(", android_font_size=");
        k.append(this.android_font_size);
        k.append(", auto_dark_mode=");
        k.append(this.auto_dark_mode);
        k.append(", density=");
        return b.j(k, this.density, "}");
    }
    
    public void write(final e e) throws IOException {
        Screen.ADAPTER.write(e, (Object)this);
    }
}

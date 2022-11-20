// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class ReddarSettings
{
    public static final a<ReddarSettings, ReddarSettings.ReddarSettings$Builder> ADAPTER;
    public final String reddar_chosen_theme;
    
    static {
        ADAPTER = (a)new ReddarSettings.ReddarSettings$ReddarSettingsAdapter((ReddarSettings$1)null);
    }
    
    private ReddarSettings(final ReddarSettings.ReddarSettings$Builder reddarSettings$Builder) {
        this.reddar_chosen_theme = ReddarSettings.ReddarSettings$Builder.access$100(reddarSettings$Builder);
    }
    
    public ReddarSettings(final ReddarSettings.ReddarSettings$Builder reddarSettings$Builder, final ReddarSettings$1 object) {
        this(reddarSettings$Builder);
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
        if (!(o instanceof ReddarSettings)) {
            return false;
        }
        final ReddarSettings reddarSettings = (ReddarSettings)o;
        final String reddar_chosen_theme = this.reddar_chosen_theme;
        final String reddar_chosen_theme2 = reddarSettings.reddar_chosen_theme;
        boolean b2 = b;
        if (reddar_chosen_theme != reddar_chosen_theme2) {
            b2 = (reddar_chosen_theme != null && reddar_chosen_theme.equals(reddar_chosen_theme2) && b);
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        final String reddar_chosen_theme = this.reddar_chosen_theme;
        int hashCode;
        if (reddar_chosen_theme == null) {
            hashCode = 0;
        }
        else {
            hashCode = reddar_chosen_theme.hashCode();
        }
        return (hashCode ^ 0x1000193) * -2128831035;
    }
    
    @Override
    public String toString() {
        return ph0.a.f(a.t("ReddarSettings{reddar_chosen_theme="), this.reddar_chosen_theme, "}");
    }
    
    public void write(final e e) throws IOException {
        ReddarSettings.ADAPTER.write(e, (Object)this);
    }
}

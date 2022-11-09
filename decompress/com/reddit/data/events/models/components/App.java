// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class App
{
    public static final a<App, App.App$Builder> ADAPTER;
    public final Integer build_number;
    public final Long build_timestamp;
    public final Long install_timestamp;
    public final String name;
    public final String relevant_locale;
    public final String version;
    
    static {
        ADAPTER = (a)new App.App$AppAdapter((App$1)null);
    }
    
    private App(final App.App$Builder app$Builder) {
        this.version = App.App$Builder.access$100(app$Builder);
        this.name = App.App$Builder.access$200(app$Builder);
        this.install_timestamp = App.App$Builder.access$300(app$Builder);
        this.build_number = App.App$Builder.access$400(app$Builder);
        this.build_timestamp = App.App$Builder.access$500(app$Builder);
        this.relevant_locale = App.App$Builder.access$600(app$Builder);
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
        if (!(o instanceof App)) {
            return false;
        }
        final App app = (App)o;
        final String version = this.version;
        final String version2 = app.version;
        if (version == version2 || (version != null && version.equals(version2))) {
            final String name = this.name;
            final String name2 = app.name;
            if (name == name2 || (name != null && name.equals(name2))) {
                final Long install_timestamp = this.install_timestamp;
                final Long install_timestamp2 = app.install_timestamp;
                if (install_timestamp == install_timestamp2 || (install_timestamp != null && install_timestamp.equals(install_timestamp2))) {
                    final Integer build_number = this.build_number;
                    final Integer build_number2 = app.build_number;
                    if (build_number == build_number2 || (build_number != null && build_number.equals(build_number2))) {
                        final Long build_timestamp = this.build_timestamp;
                        final Long build_timestamp2 = app.build_timestamp;
                        if (build_timestamp == build_timestamp2 || (build_timestamp != null && build_timestamp.equals(build_timestamp2))) {
                            final String relevant_locale = this.relevant_locale;
                            final String relevant_locale2 = app.relevant_locale;
                            boolean b2 = b;
                            if (relevant_locale == relevant_locale2) {
                                return b2;
                            }
                            if (relevant_locale != null && relevant_locale.equals(relevant_locale2)) {
                                b2 = b;
                                return b2;
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
        final String version = this.version;
        int hashCode = 0;
        int hashCode2;
        if (version == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = version.hashCode();
        }
        final String name = this.name;
        int hashCode3;
        if (name == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = name.hashCode();
        }
        final Long install_timestamp = this.install_timestamp;
        int hashCode4;
        if (install_timestamp == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = install_timestamp.hashCode();
        }
        final Integer build_number = this.build_number;
        int hashCode5;
        if (build_number == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = build_number.hashCode();
        }
        final Long build_timestamp = this.build_timestamp;
        int hashCode6;
        if (build_timestamp == null) {
            hashCode6 = 0;
        }
        else {
            hashCode6 = build_timestamp.hashCode();
        }
        final String relevant_locale = this.relevant_locale;
        if (relevant_locale != null) {
            hashCode = relevant_locale.hashCode();
        }
        return ((((((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode6) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder k = a.k("App{version=");
        k.append(this.version);
        k.append(", name=");
        k.append(this.name);
        k.append(", install_timestamp=");
        k.append(this.install_timestamp);
        k.append(", build_number=");
        k.append(this.build_number);
        k.append(", build_timestamp=");
        k.append(this.build_timestamp);
        k.append(", relevant_locale=");
        return b.j(k, this.relevant_locale, "}");
    }
    
    public void write(final e e) throws IOException {
        App.ADAPTER.write(e, (Object)this);
    }
}

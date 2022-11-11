// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import al0.g7;
import java.util.Collections;
import java.util.List;
import et.a;

public final class Setting
{
    public static final a<Setting, Setting.Setting$Builder> ADAPTER;
    public final String old_value;
    public final List<String> old_values;
    public final String scope;
    public final String value;
    public final List<String> values;
    
    static {
        ADAPTER = (a)new Setting.Setting$SettingAdapter((Setting$1)null);
    }
    
    private Setting(final Setting.Setting$Builder setting$Builder) {
        this.value = Setting.Setting$Builder.access$100(setting$Builder);
        this.old_value = Setting.Setting$Builder.access$200(setting$Builder);
        this.scope = Setting.Setting$Builder.access$300(setting$Builder);
        final List access$400 = Setting.Setting$Builder.access$400(setting$Builder);
        final List<String> list = null;
        List<String> unmodifiableList;
        if (access$400 == null) {
            unmodifiableList = null;
        }
        else {
            unmodifiableList = Collections.unmodifiableList((List<? extends String>)Setting.Setting$Builder.access$400(setting$Builder));
        }
        this.values = unmodifiableList;
        List<String> unmodifiableList2;
        if (Setting.Setting$Builder.access$500(setting$Builder) == null) {
            unmodifiableList2 = list;
        }
        else {
            unmodifiableList2 = Collections.unmodifiableList((List<? extends String>)Setting.Setting$Builder.access$500(setting$Builder));
        }
        this.old_values = unmodifiableList2;
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
        if (!(o instanceof Setting)) {
            return false;
        }
        final Setting setting = (Setting)o;
        final String value = this.value;
        final String value2 = setting.value;
        if (value == value2 || value.equals(value2)) {
            final String old_value = this.old_value;
            final String old_value2 = setting.old_value;
            if (old_value == old_value2 || (old_value != null && old_value.equals(old_value2))) {
                final String scope = this.scope;
                final String scope2 = setting.scope;
                if (scope == scope2 || (scope != null && scope.equals(scope2))) {
                    final List<String> values = this.values;
                    final List<String> values2 = setting.values;
                    if (values == values2 || (values != null && values.equals(values2))) {
                        final List<String> old_values = this.old_values;
                        final List<String> old_values2 = setting.old_values;
                        boolean b2 = b;
                        if (old_values == old_values2) {
                            return b2;
                        }
                        if (old_values != null && old_values.equals(old_values2)) {
                            b2 = b;
                            return b2;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.value.hashCode();
        final String old_value = this.old_value;
        int hashCode2 = 0;
        int hashCode3;
        if (old_value == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = old_value.hashCode();
        }
        final String scope = this.scope;
        int hashCode4;
        if (scope == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = scope.hashCode();
        }
        final List<String> values = this.values;
        int hashCode5;
        if (values == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = values.hashCode();
        }
        final List<String> old_values = this.old_values;
        if (old_values != null) {
            hashCode2 = old_values.hashCode();
        }
        return (((((hashCode ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode4) * -2128831035 ^ hashCode5) * -2128831035 ^ hashCode2) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Setting{value=");
        r.append(this.value);
        r.append(", old_value=");
        r.append(this.old_value);
        r.append(", scope=");
        r.append(this.scope);
        r.append(", values=");
        r.append(this.values);
        r.append(", old_values=");
        return g7.k(r, (List)this.old_values, "}");
    }
    
    public void write(final e e) throws IOException {
        Setting.ADAPTER.write(e, (Object)this);
    }
}

// 
// Decompiled by Procyon v0.6.0
// 

package com.twitter.sdk.android.core.internal.scribe;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import hj.a;

public class ScribeEvent
{
    private static final String CURRENT_FORMAT_VERSION = "2";
    @a("_category_")
    public final String category;
    @a("event_namespace")
    public final EventNamespace eventNamespace;
    @a("format_version")
    public final String formatVersion;
    @a("items")
    public final List<ScribeItem> items;
    @a("ts")
    public final String timestamp;
    
    public ScribeEvent(final String s, final EventNamespace eventNamespace, final long n) {
        this(s, eventNamespace, n, Collections.emptyList());
    }
    
    public ScribeEvent(final String category, final EventNamespace eventNamespace, final long n, final List<ScribeItem> list) {
        this.category = category;
        this.eventNamespace = eventNamespace;
        this.timestamp = String.valueOf(n);
        this.formatVersion = "2";
        this.items = Collections.unmodifiableList((List<? extends ScribeItem>)list);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final ScribeEvent scribeEvent = (ScribeEvent)o;
            final String category = this.category;
            Label_0062: {
                if (category != null) {
                    if (category.equals(scribeEvent.category)) {
                        break Label_0062;
                    }
                }
                else if (scribeEvent.category == null) {
                    break Label_0062;
                }
                return false;
            }
            final EventNamespace eventNamespace = this.eventNamespace;
            Label_0094: {
                if (eventNamespace != null) {
                    if (eventNamespace.equals(scribeEvent.eventNamespace)) {
                        break Label_0094;
                    }
                }
                else if (scribeEvent.eventNamespace == null) {
                    break Label_0094;
                }
                return false;
            }
            final String formatVersion = this.formatVersion;
            Label_0126: {
                if (formatVersion != null) {
                    if (formatVersion.equals(scribeEvent.formatVersion)) {
                        break Label_0126;
                    }
                }
                else if (scribeEvent.formatVersion == null) {
                    break Label_0126;
                }
                return false;
            }
            final String timestamp = this.timestamp;
            Label_0158: {
                if (timestamp != null) {
                    if (timestamp.equals(scribeEvent.timestamp)) {
                        break Label_0158;
                    }
                }
                else if (scribeEvent.timestamp == null) {
                    break Label_0158;
                }
                return false;
            }
            final List<ScribeItem> items = this.items;
            final List<ScribeItem> items2 = scribeEvent.items;
            if (items != null) {
                if (items.equals(items2)) {
                    return true;
                }
            }
            else if (items2 == null) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final EventNamespace eventNamespace = this.eventNamespace;
        int hashCode = 0;
        int hashCode2;
        if (eventNamespace != null) {
            hashCode2 = eventNamespace.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String timestamp = this.timestamp;
        int hashCode3;
        if (timestamp != null) {
            hashCode3 = timestamp.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String formatVersion = this.formatVersion;
        int hashCode4;
        if (formatVersion != null) {
            hashCode4 = formatVersion.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final String category = this.category;
        int hashCode5;
        if (category != null) {
            hashCode5 = category.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final List<ScribeItem> items = this.items;
        if (items != null) {
            hashCode = items.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("event_namespace=");
        r.append(this.eventNamespace);
        r.append(", ts=");
        r.append(this.timestamp);
        r.append(", format_version=");
        r.append(this.formatVersion);
        r.append(", _category_=");
        r.append(this.category);
        r.append(", items=");
        final StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(TextUtils.join((CharSequence)", ", (Iterable)this.items));
        sb.append("]");
        r.append(sb.toString());
        return r.toString();
    }
}

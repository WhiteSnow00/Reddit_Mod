// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import java.io.IOException;
import ft.e;
import et.a;

public final class Upload
{
    public static final a<Upload, Upload.Upload$Builder> ADAPTER;
    public final String category;
    public final Long file_size;
    public final String optimization_type;
    
    static {
        ADAPTER = (a)new Upload.Upload$UploadAdapter((Upload$1)null);
    }
    
    private Upload(final Upload.Upload$Builder upload$Builder) {
        this.file_size = Upload.Upload$Builder.access$100(upload$Builder);
        this.category = Upload.Upload$Builder.access$200(upload$Builder);
        this.optimization_type = Upload.Upload$Builder.access$300(upload$Builder);
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
        if (!(o instanceof Upload)) {
            return false;
        }
        final Upload upload = (Upload)o;
        final Long file_size = this.file_size;
        final Long file_size2 = upload.file_size;
        if (file_size == file_size2 || (file_size != null && file_size.equals(file_size2))) {
            final String category = this.category;
            final String category2 = upload.category;
            if (category == category2 || (category != null && category.equals(category2))) {
                final String optimization_type = this.optimization_type;
                final String optimization_type2 = upload.optimization_type;
                boolean b2 = b;
                if (optimization_type == optimization_type2) {
                    return b2;
                }
                if (optimization_type != null && optimization_type.equals(optimization_type2)) {
                    b2 = b;
                    return b2;
                }
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final Long file_size = this.file_size;
        int hashCode = 0;
        int hashCode2;
        if (file_size == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = file_size.hashCode();
        }
        final String category = this.category;
        int hashCode3;
        if (category == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = category.hashCode();
        }
        final String optimization_type = this.optimization_type;
        if (optimization_type != null) {
            hashCode = optimization_type.hashCode();
        }
        return (((hashCode2 ^ 0x1000193) * -2128831035 ^ hashCode3) * -2128831035 ^ hashCode) * -2128831035;
    }
    
    @Override
    public String toString() {
        final StringBuilder r = a.r("Upload{file_size=");
        r.append(this.file_size);
        r.append(", category=");
        r.append(this.category);
        r.append(", optimization_type=");
        return a.o(r, this.optimization_type, "}");
    }
    
    public void write(final e e) throws IOException {
        Upload.ADAPTER.write(e, (Object)this);
    }
}

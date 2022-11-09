// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.events.models.components;

import com.microsoft.thrifty.ThriftException;
import java.io.IOException;
import kt.e;
import a2.b;
import jt.a;

public final class Upload
{
    public static final a<Upload, Builder> ADAPTER;
    public final String category;
    public final Long file_size;
    public final String optimization_type;
    
    static {
        ADAPTER = (a)new UploadAdapter(null);
    }
    
    private Upload(final Builder builder) {
        this.file_size = Builder.access$100(builder);
        this.category = Builder.access$200(builder);
        this.optimization_type = Builder.access$300(builder);
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
        final StringBuilder k = a.k("Upload{file_size=");
        k.append(this.file_size);
        k.append(", category=");
        k.append(this.category);
        k.append(", optimization_type=");
        return b.j(k, this.optimization_type, "}");
    }
    
    public void write(final e e) throws IOException {
        Upload.ADAPTER.write(e, (Object)this);
    }
    
    public static final class Builder implements jt.b<Upload>
    {
        private String category;
        private Long file_size;
        private String optimization_type;
        
        public Builder() {
        }
        
        public Builder(final Upload upload) {
            this.file_size = upload.file_size;
            this.category = upload.category;
            this.optimization_type = upload.optimization_type;
        }
        
        public static /* synthetic */ Long access$100(final Builder builder) {
            return builder.file_size;
        }
        
        public static /* synthetic */ String access$200(final Builder builder) {
            return builder.category;
        }
        
        public static /* synthetic */ String access$300(final Builder builder) {
            return builder.optimization_type;
        }
        
        public Upload build() {
            return new Upload(this, null);
        }
        
        public Builder category(final String category) {
            this.category = category;
            return this;
        }
        
        public Builder file_size(final Long file_size) {
            this.file_size = file_size;
            return this;
        }
        
        public Builder optimization_type(final String optimization_type) {
            this.optimization_type = optimization_type;
            return this;
        }
        
        public void reset() {
            this.file_size = null;
            this.category = null;
            this.optimization_type = null;
        }
    }
    
    public static final class UploadAdapter implements a<Upload, Builder>
    {
        private UploadAdapter() {
        }
        
        public Upload read(final e e) throws IOException {
            return this.read(e, new Builder());
        }
        
        public Upload read(final e e, final Builder builder) throws IOException {
            e.H();
            while (true) {
                final kt.b q = e.q();
                final byte a = q.a;
                if (a == 0) {
                    break;
                }
                final short b = q.b;
                if (b != 1) {
                    if (b != 2) {
                        if (b != 3) {
                            mt.a.a(e, a);
                        }
                        else if (a == 11) {
                            builder.optimization_type(e.F());
                        }
                        else {
                            mt.a.a(e, a);
                        }
                    }
                    else if (a == 11) {
                        builder.category(e.F());
                    }
                    else {
                        mt.a.a(e, a);
                    }
                }
                else if (a == 10) {
                    builder.file_size(e.v());
                }
                else {
                    mt.a.a(e, a);
                }
                e.r();
            }
            e.J();
            return builder.build();
        }
        
        public void write(final e e, final Upload upload) throws IOException {
            e.a0();
            if (upload.file_size != null) {
                e.N(1, (byte)10);
                a.r(upload.file_size, e);
            }
            if (upload.category != null) {
                e.N(2, (byte)11);
                e.Z(upload.category);
                e.O();
            }
            if (upload.optimization_type != null) {
                e.N(3, (byte)11);
                e.Z(upload.optimization_type);
                e.O();
            }
            e.P();
            e.b0();
        }
    }
}

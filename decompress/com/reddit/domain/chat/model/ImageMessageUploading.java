// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f¨\u0006\r" }, d2 = { "Lcom/reddit/domain/chat/model/ImageMessageUploading;", "", "imageFile", "Ljava/io/File;", "(Ljava/io/File;)V", "getImageFile", "()Ljava/io/File;", "Complete", "Failed", "InProgress", "Lcom/reddit/domain/chat/model/ImageMessageUploading$Complete;", "Lcom/reddit/domain/chat/model/ImageMessageUploading$Failed;", "Lcom/reddit/domain/chat/model/ImageMessageUploading$InProgress;", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public abstract class ImageMessageUploading
{
    private final File imageFile;
    
    private ImageMessageUploading(final File imageFile) {
        this.imageFile = imageFile;
    }
    
    public final File getImageFile() {
        return this.imageFile;
    }
    
    @Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/chat/model/ImageMessageUploading$Complete;", "Lcom/reddit/domain/chat/model/ImageMessageUploading;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Complete extends ImageMessageUploading
    {
        private final File file;
        
        public Complete(final File file) {
            f.f((Object)file, "file");
            super(file, null);
            this.file = file;
        }
        
        public final File component1() {
            return this.file;
        }
        
        public final Complete copy(final File file) {
            f.f((Object)file, "file");
            return new Complete(file);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Complete && f.a((Object)this.file, (Object)((Complete)o).file));
        }
        
        public final File getFile() {
            return this.file;
        }
        
        @Override
        public int hashCode() {
            return this.file.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("Complete(file=");
            k.append(this.file);
            k.append(')');
            return k.toString();
        }
    }
    
    @Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/chat/model/ImageMessageUploading$Failed;", "Lcom/reddit/domain/chat/model/ImageMessageUploading;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Failed extends ImageMessageUploading
    {
        private final File file;
        
        public Failed(final File file) {
            f.f((Object)file, "file");
            super(file, null);
            this.file = file;
        }
        
        public final File component1() {
            return this.file;
        }
        
        public final Failed copy(final File file) {
            f.f((Object)file, "file");
            return new Failed(file);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof Failed && f.a((Object)this.file, (Object)((Failed)o).file));
        }
        
        public final File getFile() {
            return this.file;
        }
        
        @Override
        public int hashCode() {
            return this.file.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("Failed(file=");
            k.append(this.file);
            k.append(')');
            return k.toString();
        }
    }
    
    @Metadata(d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011" }, d2 = { "Lcom/reddit/domain/chat/model/ImageMessageUploading$InProgress;", "Lcom/reddit/domain/chat/model/ImageMessageUploading;", "file", "Ljava/io/File;", "(Ljava/io/File;)V", "getFile", "()Ljava/io/File;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class InProgress extends ImageMessageUploading
    {
        private final File file;
        
        public InProgress(final File file) {
            f.f((Object)file, "file");
            super(file, null);
            this.file = file;
        }
        
        public final File component1() {
            return this.file;
        }
        
        public final InProgress copy(final File file) {
            f.f((Object)file, "file");
            return new InProgress(file);
        }
        
        @Override
        public boolean equals(final Object o) {
            return this == o || (o instanceof InProgress && f.a((Object)this.file, (Object)((InProgress)o).file));
        }
        
        public final File getFile() {
            return this.file;
        }
        
        @Override
        public int hashCode() {
            return this.file.hashCode();
        }
        
        @Override
        public String toString() {
            final StringBuilder k = a.k("InProgress(file=");
            k.append(this.file);
            k.append(')');
            return k.toString();
        }
    }
}

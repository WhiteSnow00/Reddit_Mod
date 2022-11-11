// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

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
}

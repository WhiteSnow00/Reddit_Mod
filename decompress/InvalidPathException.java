// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.video.creation.video.render;

import sg2.e;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/video/creation/video/render/InvalidPathException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "creation_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public final class InvalidPathException extends Exception
{
    public static final int $stable = 0;
    private final String message;
    
    public InvalidPathException(final String message) {
        e.f((Object)message, "message");
        super(message);
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return this.message;
    }
}

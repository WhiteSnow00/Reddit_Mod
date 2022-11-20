// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.chat.model;

import ng2.e;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b" }, d2 = { "Lcom/reddit/domain/chat/model/MimeType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "JPEG", "PNG", "GIF", "Companion", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum MimeType
{
    private static final MimeType[] $VALUES;
    public static final Companion Companion;
    
    GIF("image/gif"), 
    JPEG("image/jpeg"), 
    PNG("image/png");
    
    private final String value;
    
    private static final MimeType[] $values() {
        return new MimeType[] { MimeType.JPEG, MimeType.PNG, MimeType.GIF };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    private MimeType(final String value) {
        this.value = value;
    }
    
    public static final MimeType toEnum(final String s) {
        return MimeType.Companion.toEnum(s);
    }
    
    public final String getValue() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/chat/model/MimeType$Companion;", "", "()V", "toEnum", "Lcom/reddit/domain/chat/model/MimeType;", "value", "", "domain_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public Companion(final DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
        
        public final MimeType toEnum(final String s) {
            for (final MimeType mimeType : MimeType.values()) {
                if (e.a((Object)mimeType.getValue(), (Object)s)) {
                    return mimeType;
                }
            }
            return null;
        }
    }
}

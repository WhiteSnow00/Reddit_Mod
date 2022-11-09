// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model;

import java.util.NoSuchElementException;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n" }, d2 = { "Lcom/reddit/domain/model/ThumbnailsPreference;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "ALWAYS", "NEVER", "COMMUNITY", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum ThumbnailsPreference
{
    ALWAYS("on"), 
    COMMUNITY("subreddit");
    
    public static final Companion Companion;
    
    NEVER("off");
    
    private final String value;
    
    static {
        Companion = new Companion(null);
    }
    
    private ThumbnailsPreference(final String value) {
        this.value = value;
    }
    
    public static final /* synthetic */ String access$getValue$p(final ThumbnailsPreference thumbnailsPreference) {
        return thumbnailsPreference.value;
    }
    
    public static final ThumbnailsPreference toEnum(final String s) {
        return ThumbnailsPreference.Companion.toEnum(s);
    }
    
    @Override
    public String toString() {
        return this.value;
    }
    
    @Metadata(d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007" }, d2 = { "Lcom/reddit/domain/model/ThumbnailsPreference$Companion;", "", "()V", "toEnum", "Lcom/reddit/domain/model/ThumbnailsPreference;", "stringValue", "", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final ThumbnailsPreference toEnum(final String s) {
            f.f((Object)s, "stringValue");
            for (final ThumbnailsPreference thumbnailsPreference : ThumbnailsPreference.values()) {
                if (f.a((Object)ThumbnailsPreference.access$getValue$p(thumbnailsPreference), (Object)s)) {
                    return thumbnailsPreference;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
    }
}

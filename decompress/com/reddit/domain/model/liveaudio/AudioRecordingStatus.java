// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.domain.model.liveaudio;

import gh2.i;
import ah2.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.Metadata;

@Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b" }, d2 = { "Lcom/reddit/domain/model/liveaudio/AudioRecordingStatus;", "", "(Ljava/lang/String;I)V", "NotAvailable", "Processing", "Available", "Removed", "Companion", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
public enum AudioRecordingStatus
{
    Available;
    
    public static final Companion Companion;
    
    NotAvailable, 
    Processing, 
    Removed;
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(d1 = { "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007¨\u0006\b" }, d2 = { "Lcom/reddit/domain/model/liveaudio/AudioRecordingStatus$Companion;", "", "()V", "fromOrdinal", "Lcom/reddit/domain/model/liveaudio/AudioRecordingStatus;", "ordinal", "", "(Ljava/lang/Integer;)Lcom/reddit/domain/model/liveaudio/AudioRecordingStatus;", "model_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public static final class Companion
    {
        private Companion() {
        }
        
        public final AudioRecordingStatus fromOrdinal(final Integer n) {
            if (n == null) {
                return AudioRecordingStatus.NotAvailable;
            }
            final AudioRecordingStatus[] values = AudioRecordingStatus.values();
            f.f((Object)values, "<this>");
            if (!new i(0, values.length - 1).i((int)n)) {
                return AudioRecordingStatus.NotAvailable;
            }
            return values[n];
        }
    }
}

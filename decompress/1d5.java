// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.ss.avframework.livestreamv2.core.interact.Client$RTCSpatialAudioPosition;
import com.bytedance.covode.number.Covode;
import com.ss.avframework.livestreamv2.core.interact.model.InteractConfig;
import com.ss.avframework.livestreamv2.core.interact.Client$StreamMixer;

public abstract class 1d5 implements Client$StreamMixer
{
    public InteractConfig LIZJ;
    
    static {
        Covode.recordClassIndex(10310);
    }
    
    public void LIZ(final InteractConfig lizj) {
        this.LIZJ = lizj;
    }
    
    public boolean updateMixSpatialAudio(final Client$RTCSpatialAudioPosition client$RTCSpatialAudioPosition) {
        return false;
    }
}

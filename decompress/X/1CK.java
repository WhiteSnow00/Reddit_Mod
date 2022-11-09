// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.ies.abmock.debugtool.mock.MockComponentRegister;
import com.bytedance.covode.number.Covode;

public final class 1CK implements d
{
    static {
        Covode.recordClassIndex(2885);
    }
    
    @Override
    public final Object LIZ(final String s) {
        try {
            final NEM configMock = MockComponentRegister.getConfigMock(0Mv.LIZIZ.getHostId());
            if (configMock == null) {
                return null;
            }
            return configMock.get(s);
        }
        catch (final Exception ex) {
            return null;
        }
    }
}

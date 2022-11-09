// 
// Decompiled by Procyon v0.6.0
// 

package w90;

import java.util.Map;
import com.reddit.screen.BaseScreen;
import com.reddit.talk.feature.create.topicpicker.TopicPickerBottomSheetScreen$a;

public final class ck implements du
{
    public final TopicPickerBottomSheetScreen$a a;
    public final kl b;
    
    public ck(final kl b, final BaseScreen baseScreen, final String s, final String s2, final String s3, final Boolean b2, final TopicPickerBottomSheetScreen$a a) {
        this.b = b;
        this.a = a;
    }
    
    public final Map<Class<?>, yt<?, ?>> getSubFeatureInjectors() {
        return this.b.k();
    }
}

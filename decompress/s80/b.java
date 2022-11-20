// 
// Decompiled by Procyon v0.6.0
// 

package s80;

import com.google.protobuf.GeneratedMessageLite$b;
import ng2.e;
import java.util.List;
import java.util.Collections;
import com.reddit.devvit.actor.user_configurable.UserConfigurableOuterClass$ConfigForm;
import com.reddit.devvit.actor.user_configurable.UserConfigurableOuterClass$ConfigField;
import pj.a;
import com.reddit.devvit.actor.user_configurable.UserConfigurableOuterClass$ConfigForm$a;

public final class b
{
    public final UserConfigurableOuterClass$ConfigForm$a a;
    
    public b(final UserConfigurableOuterClass$ConfigForm$a a) {
        this.a = a;
    }
    
    public final void a(final a a, final UserConfigurableOuterClass$ConfigField userConfigurableOuterClass$ConfigField) {
        final UserConfigurableOuterClass$ConfigForm$a a2 = this.a;
        ((GeneratedMessageLite$b)a2).e();
        UserConfigurableOuterClass$ConfigForm.access$200((UserConfigurableOuterClass$ConfigForm)((GeneratedMessageLite$b)a2).g, userConfigurableOuterClass$ConfigField);
    }
    
    public final a b() {
        final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)((UserConfigurableOuterClass$ConfigForm)((GeneratedMessageLite$b)this.a).g).getFieldsList());
        e.e((Object)unmodifiableList, "_builder.getFieldsList()");
        return new a((List)unmodifiableList);
    }
}

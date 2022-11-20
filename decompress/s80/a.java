// 
// Decompiled by Procyon v0.6.0
// 

package s80;

import com.google.protobuf.GeneratedMessageLite$b;
import com.reddit.devvit.actor.user_configurable.UserConfigurableOuterClass$ConfigField;
import ng2.e;
import com.reddit.devvit.actor.user_configurable.UserConfigurableOuterClass$ConfigFieldType;
import com.reddit.devvit.actor.user_configurable.UserConfigurableOuterClass$ConfigField$a;

public final class a
{
    public final UserConfigurableOuterClass$ConfigField$a a;
    
    public a(final UserConfigurableOuterClass$ConfigField$a a) {
        this.a = a;
    }
    
    public final void a(final UserConfigurableOuterClass$ConfigFieldType userConfigurableOuterClass$ConfigFieldType) {
        e.f((Object)userConfigurableOuterClass$ConfigFieldType, "value");
        final UserConfigurableOuterClass$ConfigField$a a = this.a;
        ((GeneratedMessageLite$b)a).e();
        UserConfigurableOuterClass$ConfigField.access$1000((UserConfigurableOuterClass$ConfigField)((GeneratedMessageLite$b)a).g, userConfigurableOuterClass$ConfigFieldType);
    }
    
    public final void b(final String s) {
        final UserConfigurableOuterClass$ConfigField$a a = this.a;
        ((GeneratedMessageLite$b)a).e();
        UserConfigurableOuterClass$ConfigField.access$1200((UserConfigurableOuterClass$ConfigField)((GeneratedMessageLite$b)a).g, s);
    }
    
    public final void c(final String s) {
        final UserConfigurableOuterClass$ConfigField$a a = this.a;
        ((GeneratedMessageLite$b)a).e();
        UserConfigurableOuterClass$ConfigField.access$1500((UserConfigurableOuterClass$ConfigField)((GeneratedMessageLite$b)a).g, s);
    }
}

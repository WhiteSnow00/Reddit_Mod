// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.events.auth;

import kotlin.Metadata;
import com.reddit.data.events.models.AnalyticsPlatform;
import bw1.a;
import l40.e$a;
import hg2.j;
import com.reddit.data.events.models.components.ActionInfo$Builder;
import com.reddit.data.events.models.Event$Builder;
import javax.inject.Inject;
import l40.e;

public final class PhoneAnalytics
{
    public final e a;
    
    @Inject
    public PhoneAnalytics(final e a) {
        sg2.e.f((Object)a, "eventSender");
        this.a = a;
    }
    
    public final void a(final Source source, final Action action, final Noun noun, final InfoType infoType) {
        final Event$Builder event$Builder = new Event$Builder();
        final ActionInfo$Builder actionInfo$Builder = new ActionInfo$Builder();
        actionInfo$Builder.type(infoType.getValue());
        final j a = j.a;
        final Event$Builder noun2 = event$Builder.action_info(actionInfo$Builder.build()).source(source.getValue()).action(action.getValue()).noun(noun.getValue());
        sg2.e.e((Object)noun2, "Builder()\n        .actio\u2026        .noun(noun.value)");
        this.e(noun2);
    }
    
    public final void b(final Source source, final Noun noun, final InfoType infoType) {
        sg2.e.f((Object)source, "source");
        sg2.e.f((Object)noun, "noun");
        sg2.e.f((Object)infoType, "type");
        this.a(source, Action.Submit, noun, infoType);
    }
    
    public final void c(final Source source, final Noun noun) {
        sg2.e.f((Object)source, "source");
        sg2.e.f((Object)noun, "noun");
        final Event$Builder noun2 = new Event$Builder().source(source.getValue()).action(Action.Click.getValue()).noun(noun.getValue());
        sg2.e.e((Object)noun2, "Builder()\n        .sourc\u2026        .noun(noun.value)");
        this.e(noun2);
    }
    
    public final void d(final Noun noun, final InfoType infoType) {
        sg2.e.f((Object)noun, "noun");
        sg2.e.f((Object)infoType, "type");
        this.a(Source.CreatePassword, Action.Submit, noun, infoType);
    }
    
    public final void e(final Event$Builder event$Builder) {
        e$a.b(this.a, event$Builder, (a)null, (AnalyticsPlatform)null, false, (String)null, (Boolean)null, 126);
    }
    
    public final void f(final Source source, final Noun noun) {
        sg2.e.f((Object)source, "source");
        sg2.e.f((Object)noun, "noun");
        final Event$Builder noun2 = new Event$Builder().source(source.getValue()).action(Action.View.getValue()).noun(noun.getValue());
        sg2.e.e((Object)noun2, "Builder()\n        .sourc\u2026        .noun(noun.value)");
        this.e(noun2);
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/reddit/events/auth/PhoneAnalytics$Action;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Click", "View", "Submit", "Login", "Skip", "Set", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Action
    {
        Click("click"), 
        Login("login"), 
        Set("set"), 
        Skip("skip"), 
        Submit("submit"), 
        View("view");
        
        private final String value;
        
        private Action(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n" }, d2 = { "Lcom/reddit/events/auth/PhoneAnalytics$InfoType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Phone", "Success", "Fail", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum InfoType
    {
        Fail("fail"), 
        Phone("phone_auth"), 
        Success("success");
        
        private final String value;
        
        private InfoType(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001f¨\u0006 " }, d2 = { "Lcom/reddit/events/auth/PhoneAnalytics$Noun;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Signup", "Login", "Cancel", "Confirm", "EnterNumber", "UsagePolicy", "Agreement", "PrivacyPolicy", "NumberVerify", "EnterOtp", "ResendOtp", "CheckOtp", "LoginComplete", "PasswordCreation", "SkipSetPassword", "SetPassword", "UpdatePhone", "AddPhone", "EnterPhone", "EnterNewPhone", "RemoveCurrentPhone", "CheckPassword", "SendOtpInstead", "AddEmail", "AddPassword", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Noun
    {
        AddEmail("add_email"), 
        AddPassword("add_password"), 
        AddPhone("add_phone_number"), 
        Agreement("user_agreement"), 
        Cancel("cancel"), 
        CheckOtp("check_otp"), 
        CheckPassword("check_password"), 
        Confirm("confirm"), 
        EnterNewPhone("enter_new_phone_number"), 
        EnterNumber("enter_number"), 
        EnterOtp("enter_otp"), 
        EnterPhone("enter_phone_number"), 
        Login("login"), 
        LoginComplete("login_complete"), 
        NumberVerify("number_verify"), 
        PasswordCreation("password_creation"), 
        PrivacyPolicy("privacy_policy"), 
        RemoveCurrentPhone("remove_current_phone_number"), 
        ResendOtp("resend_otp"), 
        SendOtpInstead("send_otp_code_instead"), 
        SetPassword("set_password"), 
        Signup("signup"), 
        SkipSetPassword("skip_set_password"), 
        UpdatePhone("update_phone_number"), 
        UsagePolicy("number_policy");
        
        private final String value;
        
        private Noun(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015" }, d2 = { "Lcom/reddit/events/auth/PhoneAnalytics$Source;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Onboarding", "UpdatePassword", "EnterPhone", "EnterPhoneOtp", "CreatePassword", "ProfileSettings", "AddPhone", "AddPhoneOtp", "UpdatePhone", "UpdatePhoneOtp", "VerifyCurrentPhoneOtp", "VerifyPassword", "RemovePhoneNumber", "AddEmail", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Source
    {
        AddEmail("add_email_address"), 
        AddPhone("add_phone_number"), 
        AddPhoneOtp("add_phone_number_otp"), 
        CreatePassword("phone_auth_create_password"), 
        EnterPhone("phone_auth_enter_phone"), 
        EnterPhoneOtp("phone_auth_otp"), 
        Onboarding("onboarding"), 
        ProfileSettings("profile_settings"), 
        RemovePhoneNumber("remove_phone_number"), 
        UpdatePassword("update_password"), 
        UpdatePhone("update_phone_number"), 
        UpdatePhoneOtp("update_phone_number_otp"), 
        VerifyCurrentPhoneOtp("verify_current_phone_number_otp"), 
        VerifyPassword("verify_your_password");
        
        private final String value;
        
        private Source(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
}

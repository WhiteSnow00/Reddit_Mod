// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.events.auth;

import kotlin.Metadata;
import com.reddit.data.events.models.components.Onboarding;
import com.reddit.data.events.models.AnalyticsPlatform;
import bw1.a;
import l40.e$a;
import kotlin.NoWhenBranchMatchedException;
import com.reddit.data.events.models.components.Popup;
import com.reddit.data.events.models.components.ActionInfo$Builder;
import cj2.j;
import com.reddit.data.events.models.Event$Builder;
import com.reddit.auth.common.sso.SsoProvider;
import gx.b;
import javax.inject.Inject;
import l40.e;

public final class AuthAnalytics
{
    public final e a;
    
    @Inject
    public AuthAnalytics(final e a) {
        sg2.e.f((Object)a, "eventSender");
        this.a = a;
    }
    
    public static InfoType a(final b b) {
        sg2.e.f((Object)b, "authType");
        InfoType infoType;
        if (b == SsoProvider.GOOGLE) {
            infoType = InfoType.Google;
        }
        else if (b == SsoProvider.APPLE) {
            infoType = InfoType.Apple;
        }
        else {
            infoType = null;
        }
        return infoType;
    }
    
    public static Event$Builder y(final AuthAnalytics authAnalytics, PageType pageType, InfoType infoType, int n) {
        final ActionInfo$Builder actionInfo$Builder = null;
        if ((n & 0x1) != 0x0) {
            pageType = null;
        }
        if ((n & 0x2) != 0x0) {
            infoType = null;
        }
        authAnalytics.getClass();
        final Event$Builder event$Builder = new Event$Builder();
        final int n2 = n = 0;
        if (pageType != null) {
            final String value = pageType.getValue();
            n = n2;
            if (value != null) {
                n = n2;
                if (j.H0((CharSequence)value) ^ true) {
                    n = 1;
                }
            }
        }
        ActionInfo$Builder page_type = actionInfo$Builder;
        if (n != 0) {
            page_type = new ActionInfo$Builder().page_type(pageType.getValue());
        }
        ActionInfo$Builder type = page_type;
        if (infoType != null) {
            ActionInfo$Builder actionInfo$Builder2;
            if ((actionInfo$Builder2 = page_type) == null) {
                actionInfo$Builder2 = new ActionInfo$Builder();
            }
            type = actionInfo$Builder2.type(infoType.getValue());
        }
        if (type != null) {
            event$Builder.action_info(type.build());
        }
        return event$Builder;
    }
    
    public final void b(final PageType pageType, final ButtonText buttonText) {
        sg2.e.f((Object)pageType, "pageType");
        sg2.e.f((Object)buttonText, "buttonText");
        final Event$Builder action_info = new Event$Builder().source(Source.Popup.getValue()).action(Action.Click.getValue()).popup(new Popup.Builder().button_text(buttonText.getValue()).build()).noun(Noun.AccountCreateConfirmation.getValue()).action_info(new ActionInfo$Builder().page_type(pageType.getValue()).build());
        sg2.e.e((Object)action_info, "Builder()\n        .sourc\u2026     ).build(),\n        )");
        this.l(action_info);
    }
    
    public final void c(final PageType pageType) {
        sg2.e.f((Object)pageType, "pageType");
        final Event$Builder action_info = new Event$Builder().source(Source.Popup.getValue()).action(Action.View.getValue()).noun(Noun.AccountCreateConfirmation.getValue()).action_info(new ActionInfo$Builder().page_type(pageType.getValue()).build());
        sg2.e.e((Object)action_info, "Builder()\n        .sourc\u2026     ).build(),\n        )");
        this.l(action_info);
    }
    
    public final void d(final Source source, final InfoType infoType, final AccountLinkingType accountLinkingType) {
        sg2.e.f((Object)source, "source");
        sg2.e.f((Object)infoType, "actionInfoType");
        sg2.e.f((Object)accountLinkingType, "linkingType");
        final Event$Builder source2 = y(this, null, infoType, 5).source(source.getValue());
        final int n = AuthAnalytics.a.a[accountLinkingType.ordinal()];
        Action action;
        if (n != 1) {
            if (n != 2) {
                throw new NoWhenBranchMatchedException();
            }
            action = Action.Disconnect;
        }
        else {
            action = Action.Connect;
        }
        final Event$Builder noun = source2.action(action.getValue()).noun(Noun.Sso.getValue());
        sg2.e.e((Object)noun, "withActionInfo(actionTyp\u2026    .noun(Noun.Sso.value)");
        this.l(noun);
    }
    
    public final void e() {
        final Event$Builder noun = new Event$Builder().source(Source.Popup.getValue()).action(Action.Dismiss.getValue()).noun(Noun.SsoSignup.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .sourc\u2026oun(Noun.SsoSignup.value)");
        this.l(noun);
    }
    
    public final void f() {
        final Event$Builder noun = new Event$Builder().source(Source.Popup.getValue()).action(Action.View.getValue()).noun(Noun.SsoSignup.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .sourc\u2026oun(Noun.SsoSignup.value)");
        this.l(noun);
    }
    
    public final void g(final Source source, final Noun noun, final PageType pageType, final InfoType infoType) {
        sg2.e.f((Object)source, "source");
        sg2.e.f((Object)noun, "noun");
        sg2.e.f((Object)infoType, "actionInfoType");
        final Event$Builder y = y(this, pageType, infoType, 4);
        if (source == Source.Popup) {
            y.popup(new Popup.Builder().button_text(ButtonText.Signup.getValue()).build());
        }
        y.source(source.getValue());
        y.action(Action.Click.getValue());
        y.noun(noun.getValue());
        this.l(y);
    }
    
    public final void h(final PageType pageType, final Source source) {
        sg2.e.f((Object)source, "source");
        sg2.e.f((Object)pageType, "pageType");
        final Event$Builder noun = y(this, pageType, null, 6).source(source.getValue()).action(Action.View.getValue()).noun(Noun.Screen.getValue());
        sg2.e.e((Object)noun, "withActionInfo(pageType \u2026 .noun(Noun.Screen.value)");
        this.l(noun);
    }
    
    public final void i() {
        final Event$Builder noun = y(this, PageType.Login, null, 6).source(Source.Global.getValue()).action(Action.View.getValue()).noun(Noun.Screen.getValue());
        sg2.e.e((Object)noun, "withActionInfo(\n        \u2026 .noun(Noun.Screen.value)");
        this.l(noun);
    }
    
    public final void j() {
        final Event$Builder noun = y(this, PageType.Signup, null, 6).source(Source.Global.getValue()).action(Action.View.getValue()).noun(Noun.Screen.getValue());
        sg2.e.e((Object)noun, "withActionInfo(\n        \u2026 .noun(Noun.Screen.value)");
        this.l(noun);
    }
    
    public final void k() {
        final Event$Builder event$Builder = new Event$Builder();
        final ActionInfo$Builder actionInfo$Builder = new ActionInfo$Builder();
        actionInfo$Builder.page_type(PageType.Signup.getValue());
        final hg2.j a = hg2.j.a;
        final Event$Builder noun = event$Builder.action_info(actionInfo$Builder.build()).source(Source.Onboarding.getValue()).action(Action.Submit.getValue()).noun(Noun.EmailValidation.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .actio\u2026un.EmailValidation.value)");
        this.l(noun);
    }
    
    public final void l(final Event$Builder event$Builder) {
        e$a.b(this.a, event$Builder, (bw1.a)null, (AnalyticsPlatform)null, false, (String)null, (Boolean)null, 126);
    }
    
    public final void m(final PageType pageType, final Source source) {
        sg2.e.f((Object)pageType, "pageType");
        sg2.e.f((Object)source, "source");
        final Event$Builder event$Builder = new Event$Builder();
        final ActionInfo$Builder actionInfo$Builder = new ActionInfo$Builder();
        actionInfo$Builder.page_type(pageType.getValue());
        final hg2.j a = hg2.j.a;
        final Event$Builder noun = event$Builder.action_info(actionInfo$Builder.build()).source(source.getValue()).action(Action.Click.getValue()).noun(Noun.Login.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .actio\u2026  .noun(Noun.Login.value)");
        this.l(noun);
    }
    
    public final void n() {
        final Event$Builder noun = new Event$Builder().source(Source.Popup.getValue()).popup(new Popup.Builder().button_text(ButtonText.Login.getValue()).build()).action(Action.Click.getValue()).noun(Noun.SsoSignup.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .sourc\u2026oun(Noun.SsoSignup.value)");
        this.l(noun);
    }
    
    public final void o(final boolean b, final PageType pageType, final Source source, final InfoType infoType) {
        sg2.e.f((Object)pageType, "pageType");
        sg2.e.f((Object)source, "source");
        final Event$Builder event$Builder = new Event$Builder();
        final ActionInfo$Builder actionInfo$Builder = new ActionInfo$Builder();
        actionInfo$Builder.page_type(pageType.getValue());
        String value;
        if (infoType != null) {
            value = infoType.getValue();
        }
        else {
            value = null;
        }
        actionInfo$Builder.type(value);
        actionInfo$Builder.success(Boolean.valueOf(b));
        final hg2.j a = hg2.j.a;
        final Event$Builder noun = event$Builder.action_info(actionInfo$Builder.build()).source(source.getValue()).action(Action.Submit.getValue()).noun(Noun.Login.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .actio\u2026  .noun(Noun.Login.value)");
        this.l(noun);
    }
    
    public final void p() {
        final Event$Builder action_info = new Event$Builder().source(Source.Onboarding.getValue()).action(Action.Submit.getValue()).noun(Noun.Login.getValue()).action_info(new ActionInfo$Builder().reason(Reason.Smartlock.getValue()).type(InfoType.Google.getValue()).build());
        sg2.e.e((Object)action_info, "Builder()\n        .sourc\u2026      .build(),\n        )");
        this.l(action_info);
    }
    
    public final void q() {
        final Event$Builder noun = new Event$Builder().source(Source.Popup.getValue()).action(Action.Click.getValue()).noun(Noun.SmartlockSaveCredential.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .sourc\u2026lockSaveCredential.value)");
        this.l(noun);
    }
    
    public final void r() {
        final Event$Builder noun = new Event$Builder().source(Source.Popup.getValue()).action(Action.Dismiss.getValue()).noun(Noun.SmartlockAccountPicker.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .sourc\u2026tlockAccountPicker.value)");
        this.l(noun);
    }
    
    public final void s() {
        final Event$Builder noun = new Event$Builder().source(Source.Popup.getValue()).action(Action.Dismiss.getValue()).noun(Noun.SmartlockSaveCredential.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .sourc\u2026lockSaveCredential.value)");
        this.l(noun);
    }
    
    public final void t() {
        final Event$Builder noun = new Event$Builder().source(Source.Popup.getValue()).action(Action.View.getValue()).noun(Noun.SmartlockSaveCredential.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .sourc\u2026lockSaveCredential.value)");
        this.l(noun);
    }
    
    public final void u() {
        final Event$Builder noun = new Event$Builder().source(Source.Popup.getValue()).action(Action.View.getValue()).noun(Noun.SmartlockAccountPicker.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .sourc\u2026tlockAccountPicker.value)");
        this.l(noun);
    }
    
    public final void v(final PageType pageType, final Source source) {
        sg2.e.f((Object)pageType, "pageType");
        sg2.e.f((Object)source, "source");
        final Event$Builder event$Builder = new Event$Builder();
        final ActionInfo$Builder actionInfo$Builder = new ActionInfo$Builder();
        actionInfo$Builder.page_type(pageType.getValue());
        final hg2.j a = hg2.j.a;
        final Event$Builder noun = event$Builder.action_info(actionInfo$Builder.build()).source(source.getValue()).action(Action.Submit.getValue()).noun(Noun.Register.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .actio\u2026noun(Noun.Register.value)");
        this.l(noun);
    }
    
    public final void w(final boolean b, final boolean b2, final PageType pageType, final Source source, final InfoType infoType) {
        sg2.e.f((Object)pageType, "pageType");
        sg2.e.f((Object)source, "source");
        final Event$Builder event$Builder = new Event$Builder();
        final ActionInfo$Builder actionInfo$Builder = new ActionInfo$Builder();
        actionInfo$Builder.page_type(pageType.getValue());
        String value;
        if (infoType != null) {
            value = infoType.getValue();
        }
        else {
            value = null;
        }
        actionInfo$Builder.type(value);
        actionInfo$Builder.success(Boolean.valueOf(b2));
        final hg2.j a = hg2.j.a;
        final Event$Builder action_info = event$Builder.action_info(actionInfo$Builder.build());
        final Onboarding.Builder builder = new Onboarding.Builder();
        builder.valid_email_submitted(b);
        final Event$Builder noun = action_info.onboarding(builder.build()).source(source.getValue()).action(Action.Submit.getValue()).noun(Noun.Register.getValue());
        sg2.e.e((Object)noun, "Builder()\n        .actio\u2026noun(Noun.Register.value)");
        this.l(noun);
    }
    
    public final void x() {
        final Event$Builder noun = y(this, PageType.SwitchAccounts, null, 6).source(Source.Global.getValue()).action(Action.View.getValue()).noun(Noun.Screen.getValue());
        sg2.e.e((Object)noun, "withActionInfo(\n        \u2026 .noun(Noun.Screen.value)");
        this.l(noun);
    }
    
    @Metadata(d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005" }, d2 = { "Lcom/reddit/events/auth/AuthAnalytics$AccountLinkingType;", "", "(Ljava/lang/String;I)V", "CONNECT", "DISCONNECT", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum AccountLinkingType
    {
        CONNECT, 
        DISCONNECT;
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e" }, d2 = { "Lcom/reddit/events/auth/AuthAnalytics$Action;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Click", "Fail", "Submit", "Connect", "Disconnect", "View", "Dismiss", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Action
    {
        Click("click"), 
        Connect("connect"), 
        Disconnect("disconnect"), 
        Dismiss("dismiss"), 
        Fail("fail"), 
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
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/events/auth/AuthAnalytics$ButtonText;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Signup", "Login", "GoBack", "Continue", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum ButtonText
    {
        Continue("continue"), 
        GoBack("go_back"), 
        Login("login"), 
        Signup("signup");
        
        private final String value;
        
        private ButtonText(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b" }, d2 = { "Lcom/reddit/events/auth/AuthAnalytics$InfoType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Google", "Apple", "Reddit", "Phone", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum InfoType
    {
        Apple("apple"), 
        Google("google"), 
        Phone("reddit_phone_auth"), 
        Reddit("reddit");
        
        private final String value;
        
        private InfoType(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014" }, d2 = { "Lcom/reddit/events/auth/AuthAnalytics$Noun;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Back", "Signup", "Login", "Register", "Username", "Email", "EmailValidation", "Sso", "Screen", "SsoSignup", "AccountCreateConfirmation", "SmartlockAccountPicker", "SmartlockSaveCredential", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Noun
    {
        AccountCreateConfirmation("account_create_confirmation"), 
        Back("back"), 
        Email("email"), 
        EmailValidation("email_validation"), 
        Login("login"), 
        Register("register"), 
        Screen("screen"), 
        Signup("signup"), 
        SmartlockAccountPicker("smartlock_account_picker"), 
        SmartlockSaveCredential("smartlock_save_credential"), 
        Sso("sso"), 
        SsoSignup("sso_signup"), 
        Username("username");
        
        private final String value;
        
        private Noun(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f" }, d2 = { "Lcom/reddit/events/auth/AuthAnalytics$PageType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Welcome", "Signup", "LoggedOut", "Login", "Home", "Inbox", "ConfirmPassword", "SwitchAccounts", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum PageType
    {
        ConfirmPassword("confirm_password"), 
        Home("home"), 
        Inbox("inbox"), 
        LoggedOut("logged_out_login_signup"), 
        Login("login"), 
        Signup("signup"), 
        SwitchAccounts("switch_accounts"), 
        Welcome("welcome");
        
        private final String value;
        
        private PageType(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/reddit/events/auth/AuthAnalytics$Reason;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "UsernameTaken", "InvalidUsername", "InvalidEmail", "Smartlock", "SignUp", "Login", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Reason
    {
        InvalidEmail("invalid_email"), 
        InvalidUsername("invalid_username"), 
        Login("login"), 
        SignUp("signup"), 
        Smartlock("smartlock"), 
        UsernameTaken("username_taken");
        
        private final String value;
        
        private Reason(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
    
    @Metadata(d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lcom/reddit/events/auth/AuthAnalytics$Source;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "Onboarding", "Home", "Inbox", "Settings", "Global", "Popup", "impl_release" }, k = 1, mv = { 1, 7, 1 }, xi = 48)
    public enum Source
    {
        Global("global"), 
        Home("home"), 
        Inbox("inbox"), 
        Onboarding("onboarding"), 
        Popup("popup"), 
        Settings("settings");
        
        private final String value;
        
        private Source(final String value) {
            this.value = value;
        }
        
        public final String getValue() {
            return this.value;
        }
    }
}

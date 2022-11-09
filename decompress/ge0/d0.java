// 
// Decompiled by Procyon v0.6.0
// 

package ge0;

import java.util.concurrent.TimeUnit;
import com.reddit.domain.model.UserSubreddit;
import com.reddit.domain.model.Account;
import javax.inject.Inject;
import a20.b;
import d22.f;
import oa0.c;

public final class d0 implements c
{
    public final f a;
    public final b b;
    
    @Inject
    public d0(final f a, final b b) {
        ah2.f.f((Object)a, "dateUtilDelegate");
        ah2.f.f((Object)b, "accountFormatterDelegate");
        this.a = a;
        this.b = b;
    }
    
    public final String a() {
        this.b.a();
        return "";
    }
    
    public final String b() {
        return this.b.b();
    }
    
    public final String c() {
        return this.b.c();
    }
    
    public final String d() {
        return this.b.c();
    }
    
    public final String e() {
        return this.b.c();
    }
    
    public final String f(final Account account) {
        ah2.f.f((Object)account, "account");
        return this.b.e(account.getLinkKarma());
    }
    
    public final String g(final Account account) {
        ah2.f.f((Object)account, "account");
        final UserSubreddit subreddit = account.getSubreddit();
        String publicDescription;
        if (subreddit != null) {
            publicDescription = subreddit.getPublicDescription();
        }
        else {
            publicDescription = null;
        }
        String s = publicDescription;
        if (publicDescription == null) {
            s = "";
        }
        return s;
    }
    
    public final String h(final Account account) {
        ah2.f.f((Object)account, "account");
        return this.a.b(2, TimeUnit.SECONDS.toMillis(account.getCreatedUtc()));
    }
    
    public final String i(final Account account) {
        ah2.f.f((Object)account, "account");
        return this.b.e(account.getTotalKarma());
    }
    
    public final String j(final Account account) {
        ah2.f.f((Object)account, "account");
        return this.b.e(account.getAwarderKarma());
    }
    
    public final String k(final Account account) {
        ah2.f.f((Object)account, "account");
        return this.b.e(account.getAwardeeKarma());
    }
    
    public final String l(final Account account) {
        ah2.f.f((Object)account, "account");
        return this.b.e(account.getCommentKarma());
    }
    
    public final String m() {
        return this.b.c();
    }
    
    public final String n() {
        return this.b.c();
    }
    
    public final String o(final int n) {
        return this.b.e(n);
    }
}

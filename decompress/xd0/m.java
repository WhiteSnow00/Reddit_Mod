// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import java.util.Map;
import okhttp3.ResponseBody;
import com.reddit.domain.model.GenderOption;
import com.reddit.domain.model.Gender;
import com.reddit.domain.model.DefaultAvatar;
import com.reddit.domain.model.MyPendingCommunityInvitations;
import com.reddit.domain.model.MyAccount;
import af2.c0;
import cg2.j;
import com.reddit.domain.model.AccountPreferencesPatch;
import com.reddit.domain.model.FileUploadLease;
import gg2.c;
import com.reddit.domain.model.ProfileImageType;
import java.io.File;
import af2.a;

public interface m
{
    a F1();
    
    Object a(final File p0, final ProfileImageType p1, final c<? super FileUploadLease> p2);
    
    Object b(final String p0, final String p1, final int p2, final c p3);
    
    Object c(final AccountPreferencesPatch p0, final c<? super j> p1);
    
    a d(final String p0, final boolean p1, final boolean p2, final long p3);
    
    Object e(final ProfileImageType p0, final String p1, final c<? super j> p2);
    
    a f(final int p0, final String p1);
    
    c0<MyAccount> g(final boolean p0);
    
    c0<MyPendingCommunityInvitations> h(final String p0);
    
    c0<DefaultAvatar> i();
    
    c0<MyAccount> j();
    
    Object k(final c<? super j> p0);
    
    Object l(final c<? super Gender> p0);
    
    Object m(final GenderOption p0, final String p1, final c<? super Boolean> p2);
    
    a n(final AccountPreferencesPatch p0);
    
    c0<Boolean> o();
    
    a p(final ProfileImageType p0, final String p1);
    
    Object q(final c<? super DefaultAvatar> p0);
    
    void r(final String p0, final boolean p1);
    
    c0<ResponseBody> s();
    
    Object updateName(final String p0, final c<? super j> p1);
    
    a updateUserSubredditSettings(final Map<String, String> p0);
    
    Object updateUserSubredditSettingsSuspend(final Map<String, String> p0, final c<? super j> p1);
}

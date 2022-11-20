// 
// Decompiled by Procyon v0.6.0
// 

package xd0;

import com.reddit.domain.model.SubmitPostSetParameters;
import com.reddit.domain.model.SubmitLinkParameters;
import com.reddit.domain.model.SubmitPollParameters;
import com.reddit.domain.model.postrequirements.SubredditPostRequirements;
import af2.c0;
import com.reddit.domain.model.postsubmit.SubmitGalleryParameters;
import cg2.j;
import com.reddit.domain.model.VideoUpload;
import com.reddit.domain.model.events.SubmitEvents;
import com.reddit.domain.model.SubmitParameters;
import com.reddit.domain.model.postsubmit.SubmitImageParameters;
import com.reddit.domain.model.postsubmit.VideoState;
import af2.t;
import com.reddit.domain.model.postrequirements.PostRequirements;
import com.reddit.domain.model.SubmitPostResult;
import com.reddit.domain.model.DiscussionType;
import r61.b;
import gg2.c;
import com.reddit.type.MimeType;
import io.reactivex.subjects.PublishSubject;

public interface r
{
    PublishSubject A();
    
    Object B(final MimeType p0, final c<? super b> p1);
    
    Object C(final String p0, final String p1, final String p2, final boolean p3, final boolean p4, final DiscussionType p5, final String p6, final String p7, final String p8, final c<? super SubmitPostResult<SubmitPostResult.MediaPostCreating>> p9);
    
    Object D(final String p0, final c<? super PostRequirements> p1);
    
    t<VideoState> a(final String p0);
    
    void b(final SubmitImageParameters p0);
    
    Object c(final SubmitParameters p0, final c<? super SubmitPostResult<SubmitPostResult.PostCreated>> p1);
    
    PublishSubject d();
    
    void e(final String p0);
    
    t<SubmitEvents.SubmitVideoResultEvent> f();
    
    PublishSubject g();
    
    Object h(final VideoUpload p0, final c<? super j> p1);
    
    t<SubmitEvents.LegacySubmitVideoResultEvent> i(final String p0);
    
    void j(final String p0, final String p1);
    
    void k(final VideoUpload p0);
    
    PublishSubject l();
    
    void m(final VideoUpload p0);
    
    void n(final String p0, final String p1);
    
    Object o(final SubmitGalleryParameters p0, final c<? super SubmitPostResult<SubmitPostResult.PostCreated>> p1);
    
    t<SubmitEvents.SubmitErrorEvent> p(final String p0);
    
    c0<b> q(final String p0, final String p1, final MimeType p2);
    
    c0<SubmitPostResult<SubmitPostResult.PostCreated>> r(final SubmitParameters p0);
    
    t<String> s(final String p0);
    
    Object t(final String p0, final c<? super SubredditPostRequirements> p1);
    
    Object u(final SubmitParameters p0, final c<? super SubmitPostResult<SubmitPostResult.PostCreated>> p1);
    
    c0<SubmitPostResult<SubmitPostResult.PostCreated>> v(final SubmitPollParameters p0);
    
    PublishSubject w();
    
    Object x(final SubmitLinkParameters p0, final c<? super SubmitPostResult<SubmitPostResult.PostCreated>> p1);
    
    Object y(final SubmitPostSetParameters p0, final c<? super SubmitPostResult<SubmitPostResult.PostCreated>> p1);
    
    c0 z(final String p0, final MimeType p1);
}

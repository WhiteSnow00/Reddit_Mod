// 
// Decompiled by Procyon v0.6.0
// 

package com.reddit.data.remote;

import wu2.w;
import av2.f;
import nf2.a;
import av2.o;
import av2.e;
import com.reddit.domain.model.mod.PostResponseWithErrors;
import nf2.c0;
import av2.c;
import kotlin.Metadata;

@Metadata(bv = {}, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J,\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H'JA\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\f2\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H§@\u00f8\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H'J,\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002H'J\b\u0010\u0012\u001a\u00020\u0011H'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013" }, d2 = { "Lcom/reddit/data/remote/RemoteAccountSettingsDataSource;", "", "", "username", "email", "apiType", "Lnf2/c0;", "Lcom/reddit/domain/model/mod/PostResponseWithErrors;", "resetPassword", "currentPassword", "newPassword", "verifyPassword", "Lwu2/w;", "updatePassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltg2/c;)Ljava/lang/Object;", "recoverUsername", "updateEmail", "Lnf2/a;", "sendVerificationEmail", "data-remote_release" }, k = 1, mv = { 1, 7, 1 })
public interface RemoteAccountSettingsDataSource
{
    @e
    @o("/api/username")
    c0<PostResponseWithErrors> recoverUsername(@c("email") final String p0, @c("api_type") final String p1);
    
    @e
    @o("/api/password")
    c0<PostResponseWithErrors> resetPassword(@c("name") final String p0, @c("email") final String p1, @c("api_type") final String p2);
    
    @f("/api/send_verification_email")
    a sendVerificationEmail();
    
    @e
    @o("/api/update_email")
    c0<PostResponseWithErrors> updateEmail(@c("curpass") final String p0, @c("email") final String p1, @c("api_type") final String p2);
    
    @e
    @o("/api/update_password")
    Object updatePassword(@c("curpass") final String p0, @c("newpass") final String p1, @c("verpass") final String p2, @c("api_type") final String p3, final tg2.c<? super w<PostResponseWithErrors>> p4);
}

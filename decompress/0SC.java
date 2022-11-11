// 
// Decompiled by Procyon v0.6.0
// 

package X;

import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.User;
import java.util.Iterator;
import kotlin.jvm.internal.n;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.covode.number.Covode;

public final class 0sc
{
    static {
        Covode.recordClassIndex(8959);
    }
    
    public static final <T, S> int LIZ(final 0sh<T, S> 0sh) {
        CTM.LIZ((Object)0sh);
        return 0sh.LIZJ().size() - 1;
    }
    
    public static final LinkPlayerInfo LIZ(final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> 0sh, final long n) {
        CTM.LIZ((Object)0sh);
        for (final LinkPlayerInfo next : 0sh.LIZJ()) {
            final User lizj = next.LIZJ;
            n.LIZIZ((Object)lizj, "");
            if (lizj.getId() == n) {
                return next;
            }
        }
        return null;
    }
    
    public static final LinkPlayerInfo LIZ(final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> 0sh, final String s) {
        CTM.LIZ((Object)0sh, (Object)s);
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final LinkPlayerInfo linkPlayerInfo = null;
        if (empty) {
            return null;
        }
        final Iterator<Object> iterator = 0sh.LIZIZ().iterator();
        LinkPlayerInfo next;
        do {
            next = linkPlayerInfo;
            if (!iterator.hasNext()) {
                break;
            }
            next = iterator.next();
        } while (!TextUtils.equals((CharSequence)next.LJIIIZ, (CharSequence)s));
        return next;
    }
    
    public static final LinkPlayerInfo LIZ(final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> 0sh, final String s, final Long n) {
        CTM.LIZ((Object)0sh);
        for (final LinkPlayerInfo next : 0sh.LIZIZ()) {
            final LinkPlayerInfo linkPlayerInfo = next;
            final User lizj = linkPlayerInfo.LIZJ;
            n.LIZIZ((Object)lizj, "");
            final long id = lizj.getId();
            if (n == null) {
                continue;
            }
            if (id == n && TextUtils.equals((CharSequence)linkPlayerInfo.LJIIIZ, (CharSequence)s)) {
                return next;
            }
        }
        return null;
    }
    
    public static final long LIZIZ(final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> 0sh, final String s) {
        CTM.LIZ((Object)0sh, (Object)s);
        if (TextUtils.isEmpty((CharSequence)s)) {
            return 0L;
        }
        while (true) {
            for (final LinkPlayerInfo next : 0sh.LIZIZ()) {
                if (TextUtils.equals((CharSequence)next.LJIIIZ, (CharSequence)s)) {
                    final LinkPlayerInfo linkPlayerInfo = next;
                    if (linkPlayerInfo != null) {
                        final User lizj = linkPlayerInfo.LIZJ;
                        if (lizj != null) {
                            return lizj.getId();
                        }
                    }
                    return 0L;
                }
            }
            LinkPlayerInfo next = null;
            continue;
        }
    }
    
    public static final LinkPlayerInfo LIZIZ(final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> 0sh, final long n) {
        CTM.LIZ((Object)0sh);
        for (final LinkPlayerInfo next : 0sh.LIZIZ()) {
            final User lizj = next.LIZJ;
            n.LIZIZ((Object)lizj, "");
            if (lizj.getId() == n) {
                return next;
            }
        }
        return null;
    }
    
    public static final LinkListUser LIZIZ(final 0sh<LinkListUser, LinkMessage> 0sh, final String s, final Long n) {
        CTM.LIZ((Object)0sh);
        final Iterator<Object> iterator = 0sh.LIZIZ().iterator();
        Object value;
        LinkListUser linkListUser;
        LinkListUser next;
        do {
            final boolean hasNext = iterator.hasNext();
            final LinkListUser linkListUser2 = null;
            final Object o = null;
            if (!hasNext) {
                return linkListUser2;
            }
            next = iterator.next();
            linkListUser = next;
            final User liz = linkListUser.LIZ;
            value = o;
            if (liz == null) {
                continue;
            }
            value = liz.getId();
        } while (!n.LIZ(value, (Object)n) || !TextUtils.equals((CharSequence)linkListUser.LJ, (CharSequence)s));
        return next;
    }
    
    public static final boolean LIZIZ(final 0sh<LinkListUser, LinkMessage> 0sh) {
        CTM.LIZ((Object)0sh);
        for (final LinkListUser next : 0sh.LIZJ()) {
            final User liz = next.LIZ;
            if (liz != null) {
                final long id = liz.getId();
                final GIK liziz = Fk2.LIZ().LIZIZ();
                n.LIZIZ((Object)liziz, "");
                if (id != liziz.LIZJ()) {
                    continue;
                }
                if (next != null) {
                    return true;
                }
                break;
            }
        }
        return false;
    }
    
    public static final Long LIZJ(final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> 0sh, final String s) {
        CTM.LIZ((Object)0sh, (Object)s);
        final LinkPlayerInfo liz = LIZ(0sh, s);
        if (liz != null) {
            final User lizj = liz.LIZJ;
            if (lizj != null) {
                return lizj.getId();
            }
        }
        return null;
    }
    
    public static final String LIZJ(final 0sh<LinkPlayerInfo, MultiLiveGuestInfoList> 0sh, final long n) {
        CTM.LIZ((Object)0sh);
        final LinkPlayerInfo liziz = LIZIZ(0sh, n);
        if (liziz != null) {
            return liziz.LJIIIZ;
        }
        return null;
    }
    
    public static final LinkListUser LIZLLL(final 0sh<LinkListUser, LinkMessage> 0sh, final long n) {
        CTM.LIZ((Object)0sh);
        for (final LinkListUser next : 0sh.LIZJ()) {
            final User liz = next.LIZ;
            if (liz != null && liz.getId() == n) {
                return next;
            }
        }
        return null;
    }
    
    public static final LinkListUser LIZLLL(final 0sh<LinkListUser, LinkMessage> 0sh, final String s) {
        CTM.LIZ((Object)0sh, (Object)s);
        final boolean empty = TextUtils.isEmpty((CharSequence)s);
        final LinkListUser linkListUser = null;
        if (empty) {
            return null;
        }
        final Iterator<Object> iterator = 0sh.LIZIZ().iterator();
        LinkListUser next;
        do {
            next = linkListUser;
            if (!iterator.hasNext()) {
                break;
            }
            next = iterator.next();
        } while (!TextUtils.equals((CharSequence)next.LJ, (CharSequence)s));
        return next;
    }
}

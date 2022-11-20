// 
// Decompiled by Procyon v0.6.0
// 

package p6;

import b7.g$a;
import com.reddit.frontpage.presentation.meta.membership.paywall.SpecialMembershipPaywallScreen$a;
import b7.c;
import java.net.UnknownServiceException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import java.net.ProtocolException;
import java.io.InterruptedIOException;
import java.nio.channels.ClosedChannelException;
import java.net.SocketException;
import b7.g;
import com.airbnb.lottie.LottieAnimationView;
import com.reddit.frontpage.presentation.meta.membership.paywall.SpecialMembershipPaywallScreen;

public final class f implements f0
{
    public final int a;
    
    public f(final int a) {
        this.a = a;
    }
    
    @Override
    public final void onResult(final Object o) {
        switch (this.a) {
            default: {
                final Throwable t = (Throwable)o;
                final SpecialMembershipPaywallScreen$a x0 = SpecialMembershipPaywallScreen.x0;
                return;
            }
            case 0: {
                final Throwable t2 = (Throwable)o;
                final f x2 = LottieAnimationView.x;
                final g$a a = g.a;
                if (t2 instanceof SocketException || t2 instanceof ClosedChannelException || t2 instanceof InterruptedIOException || t2 instanceof ProtocolException || t2 instanceof SSLException || t2 instanceof UnknownHostException || t2 instanceof UnknownServiceException) {
                    c.c("Unable to load composition.", t2);
                    return;
                }
                throw new IllegalStateException("Unable to parse composition", t2);
            }
        }
    }
}

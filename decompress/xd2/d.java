// 
// Decompiled by Procyon v0.6.0
// 

package xd2;

import com.amazonaws.ivs.player.ErrorType;
import com.amazonaws.ivs.player.Player$State;
import wd2.c;
import com.amazonaws.ivs.player.Quality;
import kotlin.NoWhenBranchMatchedException;
import com.amazonaws.ivs.player.Player$LogLevel;
import com.twilio.live.player.LogLevel;
import ng2.e;
import com.amazonaws.ivs.player.PlayerException;

public final class d
{
    public static final String a(final PlayerException ex) {
        e.f((Object)ex, "<this>");
        final StringBuilder sb = new StringBuilder();
        sb.append(ex.getCode());
        sb.append(" - ");
        sb.append(ex.getErrorMessage());
        sb.append(" - ");
        sb.append(ex.getSource());
        return sb.toString();
    }
    
    public static final Player$LogLevel b(final LogLevel logLevel) {
        e.f((Object)logLevel, "<this>");
        final int n = a.c[logLevel.ordinal()];
        Player$LogLevel player$LogLevel;
        if (n != 1) {
            if (n != 2) {
                if (n != 3) {
                    if (n != 4) {
                        if (n != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        player$LogLevel = Player$LogLevel.DEBUG;
                    }
                    else {
                        player$LogLevel = Player$LogLevel.INFO;
                    }
                }
                else {
                    player$LogLevel = Player$LogLevel.WARNING;
                }
            }
            else {
                player$LogLevel = Player$LogLevel.ERROR;
            }
        }
        else {
            player$LogLevel = Player$LogLevel.ERROR;
        }
        return player$LogLevel;
    }
    
    public static final c c(final Quality quality) {
        e.f((Object)quality, "<this>");
        final int bitrate = quality.getBitrate();
        final String codecs = quality.getCodecs();
        e.e((Object)codecs, "this.codecs");
        final float framerate = quality.getFramerate();
        final int height = quality.getHeight();
        final int width = quality.getWidth();
        final String name = quality.getName();
        e.e((Object)name, "this.name");
        return new c(codecs, name, bitrate, height, width, framerate);
    }
    
    public final class a
    {
        public static final int[] a;
        public static final int[] b;
        public static final int[] c;
        
        static {
            final int[] a2 = new int[Player$State.values().length];
            a2[((Enum)Player$State.IDLE).ordinal()] = 1;
            a2[((Enum)Player$State.READY).ordinal()] = 2;
            a2[((Enum)Player$State.BUFFERING).ordinal()] = 3;
            a2[((Enum)Player$State.PLAYING).ordinal()] = 4;
            a2[((Enum)Player$State.ENDED).ordinal()] = 5;
            a = a2;
            final int[] b2 = new int[ErrorType.values().length];
            b2[((Enum)ErrorType.OK).ordinal()] = 1;
            b2[((Enum)ErrorType.ERROR).ordinal()] = 2;
            b2[((Enum)ErrorType.ERROR_NOT_SUPPORTED).ordinal()] = 3;
            b2[((Enum)ErrorType.ERROR_NO_SOURCE).ordinal()] = 4;
            b2[((Enum)ErrorType.ERROR_INVALID_DATA).ordinal()] = 5;
            b2[((Enum)ErrorType.ERROR_INVALID_STATE).ordinal()] = 6;
            b2[((Enum)ErrorType.ERROR_INVALID_PARAMETER).ordinal()] = 7;
            b2[((Enum)ErrorType.ERROR_TIMEOUT).ordinal()] = 8;
            b2[((Enum)ErrorType.ERROR_NETWORK).ordinal()] = 9;
            b2[((Enum)ErrorType.ERROR_NETWORK_IO).ordinal()] = 10;
            b2[((Enum)ErrorType.ERROR_AUTHORIZATION).ordinal()] = 11;
            b2[((Enum)ErrorType.ERROR_NOT_AVAILABLE).ordinal()] = 12;
            b = b2;
            final int[] c2 = new int[LogLevel.values().length];
            c2[LogLevel.OFF.ordinal()] = 1;
            c2[LogLevel.ERROR.ordinal()] = 2;
            c2[LogLevel.WARNING.ordinal()] = 3;
            c2[LogLevel.INFO.ordinal()] = 4;
            c2[LogLevel.DEBUG.ordinal()] = 5;
            c = c2;
        }
    }
}

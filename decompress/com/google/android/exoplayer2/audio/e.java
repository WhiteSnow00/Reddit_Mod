// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.exoplayer2.audio;

public final class e implements DefaultAudioSink$d
{
    public e(final e.e$a e$a) {
    }
    
    public static int a(final int n) {
        switch (n) {
            default: {
                throw new IllegalArgumentException();
            }
            case 17: {
                return 336000;
            }
            case 16: {
                return 256000;
            }
            case 15: {
                return 8000;
            }
            case 14: {
                return 3062500;
            }
            case 12: {
                return 7000;
            }
            case 11: {
                return 16000;
            }
            case 10: {
                return 100000;
            }
            case 9: {
                return 40000;
            }
            case 8: {
                return 2250000;
            }
            case 7: {
                return 192000;
            }
            case 6:
            case 18: {
                return 768000;
            }
            case 5: {
                return 80000;
            }
        }
    }
}

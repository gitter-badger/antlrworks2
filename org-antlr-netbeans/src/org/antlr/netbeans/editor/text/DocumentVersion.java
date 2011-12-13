/*
 * [The "BSD license"]
 *  Copyright (c) 2011 Sam Harwell
 *  All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without
 *  modification, are permitted provided that the following conditions
 *  are met:
 *  1. Redistributions of source code must retain the above copyright
 *      notice, this list of conditions and the following disclaimer.
 *  2. Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *  3. The name of the author may not be used to endorse or promote products
 *      derived from this software without specific prior written permission.
 *
 *  THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 *  IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 *  OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 *  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 *  INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 *  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 *  DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 *  THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 *  (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 *  THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.antlr.netbeans.editor.text;

import org.netbeans.api.annotations.common.CheckForNull;
import org.netbeans.api.annotations.common.NonNull;

/**
 *
 * @author Sam Harwell
 */
public interface DocumentVersion {

    public @NonNull VersionedDocument getVersionedDocument();

    /**
     * @deprecated figure out how to handle GrammarTokensTaskTaggerSnapshot ctor without this
     */
    public @NonNull DocumentSnapshot getSnapshot();

    public int getLength();

    public int getVersionNumber();

    public @CheckForNull NormalizedDocumentChangeCollection getChanges();

    public @CheckForNull DocumentVersion getNext();

    public @NonNull TrackingPositionRegion createCustomTrackingRegion(@NonNull OffsetRegion region, @NonNull TrackingFidelity fidelity, @NonNull CustomTrackToBehavior behavior);

    public @NonNull TrackingPosition createTrackingPosition(int offset, @NonNull TrackingPosition.Bias bias);

    public @NonNull TrackingPosition createTrackingPosition(int offset, @NonNull TrackingPosition.Bias bias, @NonNull TrackingFidelity fidelity);

    public @NonNull TrackingPositionRegion createTrackingRegion(@NonNull OffsetRegion region, @NonNull TrackingPositionRegion.Bias bias);

    public @NonNull TrackingPositionRegion createTrackingRegion(int start, int length, @NonNull TrackingPositionRegion.Bias bias);

    public @NonNull TrackingPositionRegion createTrackingRegion(@NonNull OffsetRegion region, @NonNull TrackingPositionRegion.Bias bias, @NonNull TrackingFidelity fidelity);

    public @NonNull TrackingPositionRegion createTrackingRegion(int start, int length, @NonNull TrackingPositionRegion.Bias bias, @NonNull TrackingFidelity fidelity);
}
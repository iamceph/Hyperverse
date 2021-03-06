//
// Hyperverse - A Minecraft world management plugin
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program. If not, see <http://www.gnu.org/licenses/>.
//

package se.hyperver.hyperverse.events;

import org.jetbrains.annotations.NotNull;
import se.hyperver.hyperverse.world.HyperWorld;

import java.util.Objects;

/**
 * Events involving {@link se.hyperver.hyperverse.world.HyperWorld hyper worlds}
 */
public abstract class HyperWorldEvent extends HyperverseEvent {

    private final HyperWorld world;

    public HyperWorldEvent(@NotNull final HyperWorld world) {
        this.world = Objects.requireNonNull(world, "world");
    }

    /**
     * Get the world involved in this event
     *
     * @return Event world
     */
    @NotNull public final HyperWorld getWorld() {
        return this.world;
    }

}

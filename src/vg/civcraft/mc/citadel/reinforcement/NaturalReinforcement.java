package vg.civcraft.mc.citadel.reinforcement;

import org.bukkit.block.Block;

public class NaturalReinforcement extends Reinforcement{
	
	public NaturalReinforcement(Block block, int dur){
		super(block.getLocation(), null, dur, 0);
		// The group is null be natural reinforcements don't belong to a group.
	}
}
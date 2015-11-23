package net.ryanhecht.ParksQuest;

import net.ryanhecht.ParksQuest.NPCs.MinecartMan;

public interface DeliveryQuest extends Quest {
	public final QuestItem toDeliver = new QuestItem();
	NPC shipto = new MinecartMan();
}

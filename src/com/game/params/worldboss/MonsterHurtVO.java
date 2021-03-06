package com.game.params.worldboss;

import com.game.params.*;

//世界BOSS奖励(工具自动生成，请勿手动修改！）
public class MonsterHurtVO implements IProtocol {
	public int monsterId;//ID
	public int curHp;//当前血量
	public int hurt;//当前伤害
	public int type;//类型，0：玩家，1：怪物


	public void decode(BufferBuilder bb) {
		this.monsterId = bb.getInt();
		this.curHp = bb.getInt();
		this.hurt = bb.getInt();
		this.type = bb.getInt();
	}

	public void encode(BufferBuilder bb) {
		bb.putInt(this.monsterId);
		bb.putInt(this.curHp);
		bb.putInt(this.hurt);
		bb.putInt(this.type);
	}
}

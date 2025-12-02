package design_patterns.structuralPattern;

interface ICharacter{
	String getAbilities();
}

class Mario implements ICharacter{
	@Override
	public String getAbilities() {
		return "Mario";
	}
}

abstract class Decorator implements ICharacter { // has a relationship 
//	 is a relationship 
	ICharacter character;
	
	public Decorator(ICharacter character) {
		this.character=character;
	}
}
 
class MarioGunPowerAbility extends Decorator{
	ICharacter oldCharacter;
	public MarioGunPowerAbility(ICharacter character) {
		super(character);
		this.oldCharacter=character;
	}
	@Override
	public String getAbilities() {
		String oldAbilities = oldCharacter.getAbilities();
		return oldAbilities +" , "+"Mario is upgraded with GunPower Abilities";
	}
}


class MarioStarAbility extends Decorator{
	ICharacter oldCharacter;
	public MarioStarAbility(ICharacter character) {
		super(character);
		this.oldCharacter=character;
	}
	@Override
	public String getAbilities() {
		String oldAbilities = oldCharacter.getAbilities();
		return oldAbilities +" , "+"Mario is upgraded with Start Abilities";
	}
}


public class DecoratorPattern_Mario {

	public static void main(String[] args) {
		
		MarioGunPowerAbility marioGunPowerAbility=new MarioGunPowerAbility(new MarioStarAbility(new Mario()));
		System.out.println(marioGunPowerAbility.getAbilities());
	}
	
}

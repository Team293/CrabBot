package org.usfirst.frc.team293.SpikeLibrary;

import edu.wpi.first.wpilibj.Encoder;
public class SpikeEncoder extends Encoder {
	
	Encoder m_encoder;
	int m_count;
	
	public SpikeEncoder(int aChannel, int bChannel, int count) {
		super(aChannel, bChannel);
		m_encoder = new Encoder(aChannel, bChannel);
		m_count = count;
	}
	
	public double rotationCount() {
		return m_encoder.getRaw()/4/m_count;
	}

}

// Save this class in your mod and generate all required imports

/**
 * Made with Blockbench 5.1.1 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class stubAnimation {
	public static final AnimationDefinition Idle = AnimationDefinition.Builder.withLength(2.0F).looping()
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(-5.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(2.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.build();

	public static final AnimationDefinition Walking = AnimationDefinition.Builder.withLength(1.25F).looping()
			.addAnimation("head",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 30.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -30.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("body",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 10.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -10.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("left_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 120.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 120.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("right_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.75F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -120.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.build();

	public static final AnimationDefinition Attack = AnimationDefinition.Builder.withLength(0.2917F)
			.addAnimation("left_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.0833F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.2083F, KeyframeAnimations.degreeVec(28.6623F, 8.3108F, -18.256F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.2917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.addAnimation("right_arm",
					new AnimationChannel(AnimationChannel.Targets.ROTATION,
							new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.0833F, KeyframeAnimations.degreeVec(30.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.2083F, KeyframeAnimations.degreeVec(28.6623F, -8.3108F, 18.256F),
									AnimationChannel.Interpolations.CATMULLROM),
							new Keyframe(0.2917F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 0.0F),
									AnimationChannel.Interpolations.CATMULLROM)))
			.build();
}
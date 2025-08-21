let scene, camera, renderer, carModel, light;

function init() {
    // Set up the scene
    scene = new THREE.Scene();
    
    // Set up the camera
    camera = new THREE.PerspectiveCamera(75, window.innerWidth / window.innerHeight, 0.1, 1000);
    camera.position.z = 5;

    // Set up the renderer
    renderer = new THREE.WebGLRenderer();
    renderer.setSize(window.innerWidth, window.innerHeight);
    document.getElementById("webgl-container").appendChild(renderer.domElement);

    // Add lighting
    light = new THREE.AmbientLight(0xffffff, 1.5); // Ambient light
    scene.add(light);

    // Load car model (Assuming you have a 3D car model in glTF or OBJ format)
    const loader = new THREE.GLTFLoader();
    loader.load('C:\Users91971\Desktop\java\htmluidd.glb', (gltf) => {
        carModel = gltf.scene;
        scene.add(carModel);
        animate();
    });

    // Window resizing
    window.addEventListener('resize', onWindowResize, false);
}

function onWindowResize() {
    camera.aspect = window.innerWidth / window.innerHeight;
    camera.updateProjectionMatrix();
    renderer.setSize(window.innerWidth, window.innerHeight);
}

function animate() {
    requestAnimationFrame(animate);

    if (carModel) {
        // Rotate the car model for a dynamic effect
        carModel.rotation.y += 0.01;
    }

    renderer.render(scene, camera);
}

// Initialize the scene
init();
<script src="https://cdnjs.cloudflare.com/ajax/libs/three.js/r128/loaders/GLTFLoader.min.js"></script>

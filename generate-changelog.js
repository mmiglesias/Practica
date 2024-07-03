const { exec } = require('child_process');

console.log('Generando changelog...');

exec('conventional-changelog -p custom -c ./changelog.config.js -i CHANGELOG.md -s -r 0', (err, stdout, stderr) => {
  if (err) {
    console.error(`Error: ${err.message}`);
    return;
  }
  console.log(stdout);
  console.error(stderr);
  console.log('Changelog generado correctamente.');
});

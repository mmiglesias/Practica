console.log('Cargando configuración de changelog.config.js');

module.exports = {
  writerOpts: {
    transform: (commit, context) => {
      console.log('Procesando commit:', commit);
      commit.type = commit.type || 'misc';
      return commit;
    }
  }
};

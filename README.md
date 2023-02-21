docker run --rm -i --name fnserver -v $HOME/.fn/iofs:/iofs -e FN_IOFS_DOCKER_PATH=$HOME/.fn/iofs -e FN_IOFS_PATH=/iofs -v $HOME/.fn/data:/app/data -v /var/run/docker.sock:/var/run/docker.sock --privileged -p 8080:8080 --entrypoint ./fnserver tanquetav/fn-crac:latest



fn create app server
fn deploy --app server --local
fn invoke server fndemo
